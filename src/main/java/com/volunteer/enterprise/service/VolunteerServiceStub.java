package com.volunteer.enterprise.service;

import com.volunteer.enterprise.dao.IVolunteerServiceDAO;
import com.volunteer.enterprise.dto.Volunteer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VolunteerServiceStub implements IVolunteerServiceDAO {
    @Autowired
    private IVolunteerServiceDAO volunteerDAO;

    public VolunteerServiceStub(){

    }

    @Override
    public Volunteer save(Volunteer volunteer) throws Exception {
        return null;
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

    }
}
