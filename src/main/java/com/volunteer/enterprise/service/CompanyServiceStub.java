package com.volunteer.enterprise.service;
import com.volunteer.enterprise.dao.ICompanyDAO;
import com.volunteer.enterprise.dao.IVolunteerServiceDAO;
import com.volunteer.enterprise.dto.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CompanyServiceStub implements ICompanyService {
    @Autowired
    private ICompanyDAO companyDAO;

    public CompanyServiceStub() {

    }

    public CompanyServiceStub(ICompanyDAO companyDAO) {

        this.companyDAO = companyDAO;
    }

    @Override
    public void delete(int id) throws Exception {
        companyDAO.delete(id);
    }

    @Override
    public Company fetchById(int id) {
        Company foundCompany = companyDAO.fetch(id);
        return foundCompany;
    }

    @Override
    public List<Company> fetchAll() {

        return companyDAO.fetchAll();
    }

    @Override
    public Company save(Company company) throws Exception {
        return companyDAO.save(company);
    }

}
