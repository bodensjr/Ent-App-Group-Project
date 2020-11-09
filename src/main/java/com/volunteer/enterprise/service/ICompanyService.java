package com.volunteer.enterprise.service;

import com.volunteer.enterprise.dto.Company;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ICompanyService {
    void delete(int id) throws Exception;

    Company fetchById(int id);

    List<Company> fetchAll();

    Company save(Company company) throws Exception;
}
