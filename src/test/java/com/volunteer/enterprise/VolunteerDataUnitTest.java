package com.volunteer.enterprise;
import com.volunteer.enterprise.dao.IVolunteerServiceDAO;
import com.volunteer.enterprise.dto.Volunteer;
import com.volunteer.enterprise.service.IVolunteerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class VolunteerDataUnitTest{
    @Autowired
    private IVolunteerServiceDAO volunteerServiceDAO;
    private Volunteer volunteer;

    @Autowired
    IVolunteerService volunteerService;


    @Test
    void confirmJonSnow_outputsJonSnow() {
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
    void fetchCompanyID_returnsResurgentForID86452(){
        givenVolunteerDataAreAvailable();
        whenSearchVolunteerWithID86452();
        thenReturnVolunteerJonForID86452();
    }

    void givenVolunteerDataAreAvailable() {
        Volunteer volunteer1 = new Volunteer();
        volunteer1.setVolunteerID(86452);
        volunteer1.setVolunteerUser("Jon Snow");
        try {
            volunteerService.save(volunteer1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void whenSearchVolunteerWithID86452(){
        volunteer = volunteerService.fetchById(86452);

    }
    void thenReturnVolunteerJonForID86452(){
        String volunteerName = volunteer.getVolunteerUser();
        assertEquals("Jon Snow", volunteerName);

    }


}