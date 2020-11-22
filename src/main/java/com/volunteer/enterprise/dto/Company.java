package com.volunteer.enterprise.dto;

import lombok.Data;

public @Data class Company {
    private int    companyID;
    private String companyName;
    private String companyLocation;
    private String companyDesc;
    private String companyPhone;
    private String companyEmail;

    public String toString() {
        return "Company - " +
                " ID: " + companyID +
                " Name: " + companyName +
                " Location: " + companyLocation +
                " Description: " + companyDesc +
                " Phone Number: " + companyPhone +
                " Email: " + companyEmail;
    }
}
