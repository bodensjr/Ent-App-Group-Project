package com.volunteer.enterprise.service;

import com.volunteer.enterprise.dao.IVolunteerDAO;
import com.volunteer.enterprise.dto.Volunteer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VolunteerServiceStub implements IVolunteerService {
    @Autowired
    private IVolunteerDAO volunteerDAO;

    public VolunteerServiceStub(){

    }

    @Override
    public Volunteer save(Volunteer volunteer) throws Exception {
        return volunteerDAO.save(volunteer);
    }

    @Override
    public List<Volunteer> fetchAll() {
        return volunteerDAO.fetchAll();
    }

    @Override
    public void delete(int id) {
        volunteerDAO.delete(id);
    }

    @Override
    public Volunteer fetchById(int id) {
        Volunteer foundVolunteer = volunteerDAO.fetch(id);
        return foundVolunteer;
    }
}
