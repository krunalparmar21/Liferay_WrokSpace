package com.leave.reset.application.model;

public class emp {





    public long empId;

    public long enrollmentNo;

    public String firstName;

    public String lastName;

    public String contactNo;

    public String city;


    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public long getEnrollmentNo() {
        return enrollmentNo;
    }

    public void setEnrollmentNo(long enrollmentNo) {
        this.enrollmentNo = enrollmentNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public emp(long empId, long enrollmentNo, String firstName, String lastName, String contactNo, String city) {
        this.empId = empId;
        this.enrollmentNo = enrollmentNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNo = contactNo;
        this.city = city;
    }
}
