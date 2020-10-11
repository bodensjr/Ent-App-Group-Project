package com.volunteer.enterprise;


import dto.Volunteer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VolunteerServiceStub implements VolunteerService {
    @Override
    public void save(Volunteer volunteer) {

    }

    @Override
    public void delete(Integer i) {

    }

    @Override
    public List<VolunteerService> fetchAll() {
        return null;
    }
}
