package com.volunteer.enterprise.dao;

import com.volunteer.enterprise.dto.Applicant;
import java.util.List;


public interface IApplicantDAO {
    Applicant save(Applicant applicant) throws Exception;

    List<Applicant> fetchAll();

    Applicant fetch(int id);

    void delete(int id);
}
