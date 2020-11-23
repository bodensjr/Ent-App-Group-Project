package com.volunteer.enterprise;

import com.volunteer.enterprise.dto.Company;
import com.volunteer.enterprise.dto.Volunteer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EnterpriseApplicationTests {

    @Test
    void confirmVolunteerJonSnow_outputsVolunteerJonSnow() {
        Volunteer volunteer = new Volunteer();
        volunteer.setVolunteerID(86452);
        volunteer.setVolunteerEmail("Drogon145@gmail.com");
        volunteer.setVolunteerUser("Jon Snow");
        volunteer.setVolunteerPass("Passw0rd@01");
        assertEquals(86452, volunteer.getVolunteerID());
        assertEquals("Drogon145@gmail.com", volunteer.getVolunteerEmail());
        assertEquals("Jon Snow", volunteer.getVolunteerUser());
        assertEquals("Passw0rd@01", volunteer.getVolunteerPass());
    }

    @Test
    void confirmCompanyAwesome_outputsCompanyAwesome() {
        Company company = new Company();
        company.setcompanyID(600673);
        company.setcompanyName("Awesome INC");
        company.setcompanyLocation("Happyville, OH");
        company.setcompanyDesc("An awesome company");
        company.setcompanyPhone("867-5309");
        company.setcompanyEmail("Awesome@cool.com");
        assertEquals(600673, company.getcompanyID());
        assertEquals("Awesome INC", company.getcompanyName());
        assertEquals("Happyville, OH", company.getcompanyLocation());
        assertEquals("An awesome company", company.getcompanyDesc());
        assertEquals("867-5309", company.getcompanyPhone());
        assertEquals("Awesome@cool.com", company.getcompanyEmail());
    }

    @Test
    void confirmApplicantKrabs_outputsApplicantKrabs() {
        Applicant applicant = new Applicant();
        applicant.setapplicantID(6003473);
        applicant.setapplicantName("Eugene Krabs");
        applicant.setapplicantProf("Restaurant Owner");
        applicant.setapplicantCred("Money, money, money!");
        applicant.setapplicantPhone("472-6374");
        applicant.setapplicantEmail("Money@krabs.com");
        applicant.setapplicantDesc("Money, money, money, money, money!");
        assertEquals(6003473, applicant.getapplicantID());
        assertEquals("Eugene Krabs", applicant.getapplicantName());
        assertEquals("Restaurant Owner", applicant.getapplicantProf());
        assertEquals("Money, money, money!", applicant.getapplicantCred());
        assertEquals("472-6374", applicant.getapplicantPhone());
        assertEquals("Money@krabs.com", applicant.getapplicantEmail());
        assertEquals("Money, money, money, money, money!", applicant.getapplicantDesc());
    }
    
}
