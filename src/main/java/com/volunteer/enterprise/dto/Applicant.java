package com.volunteer.enterprise.dto;

import lombok.Data;

public @Data class Applicant {
    private int    applicationID;
    private String applicantName;
    private String applicantProf;
    private String applicantCred;
    private String applicantPhone;
    private String applicantEmail;
    private String applicantDesc;

    public String toString() {
        return "Applicant - " +
                " ID: " + applicationID +
                " Name: " + applicantName +
                " Type of Job: " + applicantProf +
                " Credentials: " + applicantCred +
                " Phone Number: " + applicantPhone +
                " Email: " + applicantEmail +
                " Description: " + applicantDesc;
    }
}
