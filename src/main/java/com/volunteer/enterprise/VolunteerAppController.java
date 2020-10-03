package com.volunteer.enterprise;
import dto.Volunteer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class VolunteerAppController {

 @Autowired
 VolunteerService volunteerService;


    @RequestMapping("/")
    public String index(Model model){

Volunteer volunteer = new Volunteer();

volunteer.setVolunteerID(1);
volunteer.setVolunteerUser("Iron Man");
volunteer.setVolunteerPass("1234");

model.addAttribute(volunteer);
        return "Index";

    }





    @RequestMapping("/saveVolunteer")
    public String saveVolunteer(Volunteer volunteer){

        return "Index";
    }









    @PostMapping(value="/volunteer", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Volunteer createVolunteer(@RequestBody Volunteer volunteer){
        Volunteer newVolunteer = null;
        try {
            newVolunteer = volunteerService.save(volunteer);
        }catch (Exception e){
            //TODO later
        }
        return  newVolunteer;
    }









    @DeleteMapping("/volunteer/{id/}")
    public ResponseEntity deleteVolunteer(@PathVariable("id") String id){
        try{
            volunteerService.delete(Integer.parseInt(id));
            return new ResponseEntity(HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }




}
