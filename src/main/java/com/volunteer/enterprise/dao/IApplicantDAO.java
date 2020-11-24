package com.volunteer.enterprise.dao;

import com.volunteer.enterprise.dto.Volunteer;
import java.util.List;


public interface IVolunteerDAO {
    Volunteer save(Volunteer volunteer) throws Exception;

    List<Volunteer> fetchAll();
    
    //get the values of the variables in Company to display in HTML
    document.getElementById("company").innerHTML = fetchAll();

    Volunteer fetch(int id);

    void delete(int id);
}
