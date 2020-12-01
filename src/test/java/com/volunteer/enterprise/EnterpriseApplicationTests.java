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
        company.setCompanyID(600673);
        company.setCompanyName("Awesome INC");
        company.setCompanyLocation("Happyville, OH");
        company.setCompanyDesc("An awesome company");
        company.setCompanyPhone("867-5309");
        company.setCompanyEmail("Awesome@cool.com");
        assertEquals(600673, company.getCompanyID());
        assertEquals("Awesome INC", company.getCompanyName());
        assertEquals("Happyville, OH", company.getCompanyLocation());
        assertEquals("An awesome company", company.getCompanyDesc());
        assertEquals("867-5309", company.getCompanyPhone());
        assertEquals("Awesome@cool.com", company.getCompanyEmail());
    }

    @Test
    void confirmApplicantKrabs_outputsApplicantKrabs() {
        Applicant applicant = new Applicant();
        applicant.setApplicantID(6003473);
        applicant.setApplicantName("Eugene Krabs");
        applicant.setApplicantProf("Restaurant Owner");
        applicant.setApplicantCred("Money, money, money!");
        applicant.setApplicantPhone("472-6374");
        applicant.setApplicantEmail("Money@krabs.com");
        applicant.setApplicantDesc("Money, money, money, money, money!");
        assertEquals(6003473, applicant.getApplicantID());
        assertEquals("Eugene Krabs", applicant.getApplicantName());
        assertEquals("Restaurant Owner", applicant.getApplicantProf());
        assertEquals("Money, money, money!", applicant.getApplicantCred());
        assertEquals("472-6374", applicant.getApplicantPhone());
        assertEquals("Money@krabs.com", applicant.getApplicantEmail());
        assertEquals("Money, money, money, money, money!", applicant.getApplicantDesc());
    }
    
}
