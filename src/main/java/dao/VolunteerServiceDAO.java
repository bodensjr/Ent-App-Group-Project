package dao;

import dto.Volunteer;

import java.util.List;

public interface VolunteerServiceDAO {
    Volunteer save(Volunteer volunteer) throws Exception;

    List<Volunteer> fetchAll();

    Volunteer fetch(int id);
}