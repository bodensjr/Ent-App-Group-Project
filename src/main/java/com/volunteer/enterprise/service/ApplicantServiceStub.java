package com.volunteer.enterprise.service;

import com.volunteer.enterprise.dao.IApplicantDAO;
import com.volunteer.enterprise.dto.Applicant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantServiceStub implements IApplicantService {
    @Autowired
    private IApplicantDAO applicantDAO;

    public ApplicantServiceStub() {}

    public ApplicantServiceStub(IApplicantDAO applicantDAO) {
        this.applicantDAO = applicantDAO;
    }

    @Override
    public void delete(int id) throws Exception {
        applicantDAO.delete(id);
    }

    @Override
    public Applicant fetchById(int id) {
        Applicant foundApplicant = applicantDAO.fetch(id);
        return foundApplicant;
    }

    @Override
    public List<Applicant> fetchAll() {
        return applicantDAO.fetchAll();
    }

    @Override
    public Applicant save(Applicant applicant) throws Exception {
        return applicantDAO.save(applicant);
    }
}
