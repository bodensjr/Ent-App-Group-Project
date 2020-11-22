package com.volunteer.enterprise.service;

import com.volunteer.enterprise.dto.Applicant;

import java.util.List;

public interface IApplicantService {
    void delete(int id) throws Exception;

    Applicant fetchById(int id);

    List<Applicant> fetchAll();

    Applicant save(Applicant applicant) throws Exception;
}
