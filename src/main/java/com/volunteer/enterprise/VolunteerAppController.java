package com.volunteer.enterprise;
import com.volunteer.enterprise.dto.Company;
import com.volunteer.enterprise.dto.Applicant;
import com.volunteer.enterprise.dto.Volunteer;
import com.volunteer.enterprise.service.ICompanyService;
import com.volunteer.enterprise.service.IVolunteerService;
import com.volunteer.enterprise.service.IApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class VolunteerAppController {
    @Autowired
    IVolunteerService volunteerService;

    @Autowired
    ICompanyService companyService;
    
    @Autowired
    IApplicantService applicantService;

    /**
     * GetMapping for root(/) endpoint
     * Create a Voluntier volunteer object and then display start
     *
     * @return Voluntier index page
     */
    @GetMapping("/")
    public String index(Model model){
        Volunteer volunteer = new Volunteer();
        volunteer.setVolunteerID(1);
        volunteer.setVolunteerEmail("tony@starkindustries.com");
        volunteer.setVolunteerUser("Iron Man");
        volunteer.setVolunteerPass("1234");

        // Add newly created favorite to model so it can be displayed
        model.addAttribute(volunteer);
        return "Index";
    }

    /**
     * GetMapping for /company endpoint
     * Create a company object and then display company form page
     *
     * @return company form page
     */
    @GetMapping("/company")
    public String company(Model model){
        Company company = new Company();
        company.setCompanyEmail("vertex@gmail.com");
        company.setCompanyPass("Man");
        company.setCompanyID(1);
        company.setCompanyUser("Bat");

        // Add newly created favorite to model so it can be displayed
        model.addAttribute(company);
        return "company";
    }

    /**
     * GetMapping for /saveVolunteer endpoint
     * Save a new volunteer with details provided via HTTP query string
     *
     * @param volunteer provided through HTTP query
     * @return Volunteer Index page displaying newly saved volunteer
     */
    @GetMapping("/saveVolunteer")
    public String saveVolunteer(Volunteer volunteer, Model model){
        try {
            volunteerService.save(volunteer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Add newly created volunteer to model so it can be displayed
        model.addAttribute(volunteer);
        return "Index";
    }

    /**
     * PostMapping for /volunteer endpoint
     * Create a new volunteer with details provided via JSON
     *
     * Returns one of the following status codes:
     * 201: Created
     * 409: Conflict - Volunteer likely already exists
     * @param volunteer a JSON representation of Volunteer object to create
     * @return a newly created volunteer
     */
    @PostMapping(value="/volunteer", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Volunteer createVolunteer(@RequestBody Volunteer volunteer){
        Volunteer newVolunteer = null;
        try {
            newVolunteer = volunteerService.save(volunteer);
        } catch (Exception e){
            e.printStackTrace();
        }
        return  newVolunteer;
    }

    /**
     * DeleteMapping for /volunteer/{id} endpoint
     * Delete volunteer with provided ID
     *
     * @param id a unique identifier for volunteer to delete
     * @return one of the following status codes:
     *  200: Volunteer deletion success, even if volunteer didn't exist
     *  409: Volunteer deletion error, likely provided malformed id
     */
    @DeleteMapping("/volunteer/{id}")
    public ResponseEntity deleteVolunteer(@PathVariable("id") String id){
        try {
            volunteerService.delete(Integer.parseInt(id));
            return new ResponseEntity(HttpStatus.OK);

        } catch (Exception e){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * GetMapping for /saveCompany endpoint
     * Save a new company with details provided via HTTP query string
     *
     * @param company - a company with provided through HTTP query
     * @return Company form page displaying newly saved company
     */
    @GetMapping("/saveCompany")
    public String saveCompany(Company company, Model model){
        try {
            companyService.save(company);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Add newly created volunteer to model so it can be displayed
        model.addAttribute(company);
        return "company";
    }

    /**
     * GetMapping for /volunteers endpoint
     *
     * @return all volunteers
     */
    @GetMapping("/volunteers")
    @ResponseBody
    public List<Volunteer> fetchAllVolunteers() {
        return volunteerService.fetchAll();
    }

    /**
     * GetMapping for /companies endpoint
     *
     * @return all volunteers
     */
    @GetMapping("/companies")
    @ResponseBody
    public List<Company> fetchAllCompanies() {
        return companyService.fetchAll();
    }
}
