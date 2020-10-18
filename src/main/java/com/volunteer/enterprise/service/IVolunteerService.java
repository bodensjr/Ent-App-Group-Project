package com.volunteer.enterprise.service;
import com.volunteer.enterprise.dto.Volunteer;

import java.util.List;

public interface IVolunteerService {
    /**
     *
     * @param volunteer
     * @return
     */

    void delete(int parseInt) throws Exception;

    Volunteer fetchById (int id);
    List<Volunteer> fetchAll();

    Volunteer save(Volunteer volunteer) throws Exception;


}