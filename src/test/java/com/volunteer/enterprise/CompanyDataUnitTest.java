package com.volunteer.enterprise;
import com.volunteer.enterprise.dao.ICompanyDAO;
import com.volunteer.enterprise.dto.Company;
import com.volunteer.enterprise.dto.Volunteer;
import com.volunteer.enterprise.service.ICompanyService;
import com.volunteer.enterprise.service.IVolunteerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CompanyDataUnitTest {
    @Autowired
    private ICompanyDAO companyDAO;
    private Company company;


    @Autowired
    ICompanyService companyService;

    @Test
    void confirmResurgent_outputsResurgent(){
        Company company = new Company();
        company.setCompanyID(2);
        company.setCompanyUser("Resurgent");
        company.setCompanyPass("ITGeek");
        company.setCompanyEmail("resurgent@mail.com");
        assertEquals(2,  company.getCompanyID());
        assertEquals("Resurgent", company.getCompanyUser());
        assertEquals("ITGeek", company.getCompanyPass());
        assertEquals("resurgent@mail.com", company.getCompanyEmail());

    }

    @Test
    void fetchCompanyID_returnsResurgentForID2(){
        givenCompanyDataAreAvailable();
        whenSearchCompanyWithID2();
        thenReturnResurgentCompanyForID2();
    }
    void givenCompanyDataAreAvailable(){
        Company company1 = new Company();
        company1.setCompanyID(2);
        company1.setCompanyUser("Resurgent");
        try {
            companyService.save(company1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void whenSearchCompanyWithID2() {
       company = companyService.fetchById(2);
    }
    void thenReturnResurgentCompanyForID2(){
        String companyName = company.getCompanyUser();
        assertEquals("Resurgent", companyName);
    }

}
