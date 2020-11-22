package com.volunteer.enterprise.dao;

import com.volunteer.enterprise.dto.Volunteer;
import java.util.List;


public interface IVolunteerDAO {
    Volunteer save(Volunteer volunteer) throws Exception;

    List<Volunteer> fetchAll();

    Volunteer fetch(int id);

    void delete(int id);
}
