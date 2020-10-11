package com.volunteer.enterprise;

import org.springframework.stereotype.Component;

import dto.Volunteer;
import java.util.List;

@Component
public interface VolunteerService {
    // Should pass dto objects in this methods
    void save(Volunteer volunteer);

    // Your controller called the delete method but there was not one found
    void delete(Integer i);

    List<VolunteerService> fetchAll();
}