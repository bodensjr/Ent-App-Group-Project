package dao;

import dto.Volunteer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class VolunteerServiceDAOStub implements VolunteerServiceDAO {

    //List<Volunteer> allVolunteers = new ArrayList<Volunteer>();
    Map<Integer, Volunteer> allVolunteers = new HashMap<>();

    @Override
    public Volunteer save(Volunteer volunteer) throws Exception {
        allVolunteers.add(volunteer);
        return volunteer;
    }

    @Override
    public List<Volunteer> fetchAll() {
        return allVolunteers;
    }

    @Override
    public Volunteer fetch(int id) {
        return null;
    }
}
