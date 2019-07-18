package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyAndEmployeeFacadeTest {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    CompanyAndEmployeeFacade companyAndEmployeeFacade;

    @Test
    public void testFindByFragmentProcessor() {
        //Given
        Employee employee = new Employee("John","Bravo");
        Company company = new Company("Samsung");
        employeeDao.save(employee);
        companyDao.save(company);
        //When
        List<Company> companies = companyAndEmployeeFacade.findCompanyByGivenFragment("un");
        List<Employee> employees = companyAndEmployeeFacade.findEmployeeByGivenFragment("oh");
        //Then
        Assert.assertEquals(1,companies.size());
        Assert.assertEquals(1,employees.size());
    }

}