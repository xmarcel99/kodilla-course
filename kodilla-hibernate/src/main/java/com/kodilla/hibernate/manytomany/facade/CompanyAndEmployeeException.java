package com.kodilla.hibernate.manytomany.facade;

public class CompanyAndEmployeeException extends Exception {
    public static String CANNOT_FIND_COMPANY_ERR = "Can't find company with given fragment of the name";
    public static String CANNOT_FIND_EMPLOYEE_ERR = "Can't find employee with given fragment of firstname";

    public CompanyAndEmployeeException(String message) {
        super(message);
    }
}
