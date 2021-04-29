package com.job.portal.service;

import com.job.portal.entity.Company;
import com.job.portal.reporsitory.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company createCompany(Company company) {
        return companyRepository.save(company);
    }

    public Company getCompany(long id) {
        Optional<Company> company = companyRepository.findById(id);
        return company.orElse(null);
    }

    public List<Company> getAllCompanies() {
        Iterable<Company> iterableCompanies = companyRepository.findAll();
        List<Company> companies = new ArrayList<>();

        for (Company company: iterableCompanies) {
            companies.add(company);
        }

        return companies;
    }

    public Company updateCompany(Company company) {
        return companyRepository.save(company);
    }

    public void deleteCompany(long id) {
        companyRepository.deleteById(id);
    }
}
