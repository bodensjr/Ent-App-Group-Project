package com.volunteer.enterprise.service;

import com.volunteer.enterprise.dao.IVolunteerServiceDAO;
import com.volunteer.enterprise.dto.Volunteer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VolunteerServiceStub implements IVolunteerService {
    @Autowired
    private IVolunteerServiceDAO volunteerServiceDAO;

    public VolunteerServiceStub(){

    }

    @Override
    public Volunteer save(Volunteer volunteer) throws Exception {
        return volunteerServiceDAO.save(volunteer);
    }

    @Override
    public List<Volunteer> fetchAll() {
        return null;
    }

    @Override
    public Volunteer fetch(int id) {
        return null;
    }

    @Override
    public void delete(int id) {
        volunteerServiceDAO.delete(id);
    }

    @Override
    public Volunteer fetchById(int id) {
        Volunteer foundVolunteer = volunteerServiceDAO.fetch(id);
        return foundVolunteer;
    }
}
