package com.volunteer.enterprise.dto;

import lombok.Data;

public @Data class Company {
    private int companyID;
    private String companyEmail;
    private String companyUser;
    private String companyPass;

    public String toString() {
        return "Company - " +
                " ID: " + companyID +
                " Email: " + companyEmail +
                " User: " + companyUser +
                " Password: " + companyPass;
    }
}
