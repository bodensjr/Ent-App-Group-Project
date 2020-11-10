package com.volunteer.enterprise.service;

import com.volunteer.enterprise.dto.Company;

import java.util.List;

public interface ICompanyService {
    void delete(int id) throws Exception;

    Company fetchById(int id);

    List<Company> fetchAll();

    Company save(Company company) throws Exception;
}
