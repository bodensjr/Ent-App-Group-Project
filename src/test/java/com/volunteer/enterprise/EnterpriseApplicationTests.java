package com.volunteer.enterprise;

import com.volunteer.enterprise.dto.Volunteer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EnterpriseApplicationTests {

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

}
