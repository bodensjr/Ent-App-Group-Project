package com.volunteer.enterprise;
import com.volunteer.enterprise.dto.Company;
import com.volunteer.enterprise.dto.Volunteer;
import com.volunteer.enterprise.service.IVolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class VolunteerAppController {
    IVolunteerService volunteerService;

    /**
     *RequestMapping for root (/) endpoint
     * Create a Voluntier volunteer object then display start
     * @return Voluntier index page
     */

    @RequestMapping("/")
    public String index(Model model){

    Volunteer volunteer = new Volunteer();
    volunteer.setVolunteerID(1);
    volunteer.setVolunteerUser("Iron Man");
    volunteer.setVolunteerPass("1234");
    model.addAttribute(volunteer);

        // Add newly created favorite to model so it can be displayed
        model.addAttribute(volunteer);
        return "Index";

    }




    /**
     *RequestMapping for root (/) endpoint
     * Create a Company company object then display company form page
     * @return company form page
     */

    @RequestMapping("/company")
    public String company(Model model){

        Company company = new Company();
        company.setCompanyEmail("vertex@gmail.com");
        company.setCompanyPass("Man");
        company.setCompanyID(1);
        model.addAttribute(company);

        // Add newly created favorite to model so it can be displayed
        model.addAttribute(company);
        return "company";

    }







    /**
     * RequestMapping for /saveVolunteer endpoint
     * Save a nww volunteer with details provided via HTTP query string
     * @param volunteer provided through HTTP query
     * @return Volunteer Index page displaying newly saved volunteer
     */



    @RequestMapping("/saveVolunteer")
    public String saveVolunteer(Volunteer volunteer, Model model){
        try {
            volunteerService.save(volunteer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Add newly created volunteer to model so it can be displayed
        model.addAttribute(volunteer);
        return "start";
    }

    /**
     * PostMapping for /volunteer endpoint
     *Create a nwe volunteer with details provided via JSON
     *
     * Returns one of the following status codes:
     * 201:
     * 409:
     * @param volunteer a JSON representation of Volunteer object to create
     * @return a newly created volunteer
     */

    @PostMapping(value="/volunteer", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Volunteer createVolunteer(@RequestBody Volunteer volunteer){
        Volunteer newVolunteer = null;
        try {
            newVolunteer = volunteerService.save(volunteer);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  newVolunteer;
    }

    /**
     * Add comments here
     *
     *
     *
     *
     * @param id
     * @return
     */
    @DeleteMapping("/volunteer/{id/}")
    public ResponseEntity deleteVolunteer(@PathVariable("id") String id){
        try{

            return new ResponseEntity(HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
