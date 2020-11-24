package com.volunteer.enterprise.dao;

import com.volunteer.enterprise.dto.Company;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CompanyDAOStub implements ICompanyDAO {
    Map<Integer, Company> allCompanies = new HashMap<>();

    @Override
    public Company save(Company company) throws Exception {
        allCompanies.put(company.getCompanyID(), company);
        return company;
    }

    @Override
    public List<Company> fetchAll() {
        List<Company> returnCompanies = new ArrayList<>(allCompanies.values());
        return returnCompanies;
    }

    @Override
    public Company fetch(int id) {
        return allCompanies.get(id);
    }

    @Override
    public void delete(int id) {
        allCompanies.remove(id);
    }
    
    //get the values of the variables in Company to display in HTML
    document.getElementById("company").innerHTML = fetchAll();
}
