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
    void confirmCompanyGoogle_outputsCompanyGoogle() {
        Company company = new Company();
        company.setCompanyID(600673);
        company.setCompanyEmail("owner@google.com");
        company.setCompanyUser("Sergey Page");
        company.setCompanyPass("Y@hoo_Suck$");
        assertEquals(600673, company.getCompanyID());
        assertEquals("owner@google.com", company.getCompanyEmail());
        assertEquals("Sergey Page", company.getCompanyUser());
        assertEquals("Y@hoo_Suck$", company.getCompanyPass());
    }

}
