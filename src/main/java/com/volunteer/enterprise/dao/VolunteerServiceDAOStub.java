package  com.volunteer.enterprise.dao;

import com.volunteer.enterprise.dto.Volunteer;
import com.volunteer.enterprise.service.IVolunteerService;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class VolunteerServiceDAOStub implements IVolunteerServiceDAO {

    Map<Integer, Volunteer> allVolunteers = new HashMap<>();
    Map<Integer, Company> allCompanies = new HashMap<>();

    @Override
    public Volunteer save(Volunteer volunteer) throws Exception {
        allVolunteers.put(volunteer.getVolunteerID(),volunteer);
        return volunteer;
    }
    @Override
    public List<Volunteer> fetchAll() {
        HashMap<Object, Object> allVolunteer;
        List<Volunteer> returnVolunteers = new ArrayList(allVolunteers.values());
        return returnVolunteers;
    }

    @Override
    public Volunteer fetch(int id) {
        return null;
    }

    @Override
    public void delete(int id) {
        allVolunteers.remove(id);
    }
    
        @Override
    public Company save(Volunteer company) throws Exception {
        allCompanies.put(company.getCompanyID(),company);
        return company;
    }
    @Override
    public List<Company> fetchAll() {
        HashMap<Object, Object> allCompany;
        List<Company> returnCompanies = new ArrayList(allCompanies.values());
        return returnCompanies;
    }

    @Override
    public Company fetch(int id) {
        return null;
    }

    @Override
    public void delete(int id) {
        allCompanies.remove(id);
    }
}
