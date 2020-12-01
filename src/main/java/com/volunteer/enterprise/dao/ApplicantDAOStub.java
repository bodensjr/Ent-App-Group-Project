  
package  com.volunteer.enterprise.dao;

import com.volunteer.enterprise.dto.Volunteer;
import com.volunteer.enterprise.dto.Applicant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class ApplicantDAOStub implements IApplicantDAO {

    Map<Integer, Applicant> allApplicants = new HashMap<>();

    @Override
    public Applicant save(Applicant applicant) throws Exception {
        allApplicants.put(applicant.getApplicantID(),applicant);
        return applicant;
    }
    @Override
    public List<Applicant> fetchAll() {
        List<Applicant> returnApplicants = new ArrayList(allApplicants.values());
        return returnApplicants;
    }

    @Override
    public Applicant fetch(int id) {
        return allApplicants.get(id);
    }

    @Override
    public void delete(int id) {
        allApplicants.remove(id);
    }
}
