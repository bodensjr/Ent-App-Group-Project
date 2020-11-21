package com.volunteer.enterprise.dto;

import lombok.Data;

public @Data class Applicant {
    private int applicantID;
    private String applicantEmail;
    private String applicantUser;
    private String applicantPass;

    public String toString() {
        return "Company - " +
                " ID: " + applicantID +
                " Email: " + applicantEmail +
                " User: " + applicantUser +
                " Password: " + applicantPass;
    }
}
