  
package  com.volunteer.enterprise.dao;

import com.volunteer.enterprise.dto.Volunteer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class VolunteerDAOStub implements IVolunteerDAO {

    Map<Integer, Volunteer> allVolunteers = new HashMap<>();

    @Override
    public Volunteer save(Volunteer volunteer) throws Exception {
        allVolunteers.put(volunteer.getVolunteerID(),volunteer);
        return volunteer;
    }
    @Override
    public List<Volunteer> fetchAll() {
        List<Volunteer> returnVolunteers = new ArrayList(allVolunteers.values());
        return returnVolunteers;
    }

    @Override
    public Volunteer fetch(int id) {
        return allVolunteers.get(id);
    }

    @Override
    public void delete(int id) {
        allVolunteers.remove(id);
    }
}
