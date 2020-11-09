package com.volunteer.enterprise.dao;
import com.volunteer.enterprise.dto.Company;

import java.util.List;

public interface ICompanyDAO {
        Company save(Company company) throws Exception;

        List<Company> fetchAll();

        Company fetch(int id);

        void delete(int id);
}
