package com.volunteer.enterprise.dao;

import com.volunteer.enterprise.dto.Company;

import java.util.List;

public interface ICompanyDAO {
    Company save(Company company) throws Exception;

    List<Company> fetchAll();
    
    //get the values of the variables in Company to display in HTML
    document.getElementById("company").innerHTML = fetchAll();

    Company fetch(int id);

    void delete(int id);
}
