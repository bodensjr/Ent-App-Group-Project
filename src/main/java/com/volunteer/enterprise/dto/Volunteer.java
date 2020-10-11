package com.volunteer.enterprise.dto;

import lombok.Data;

public @Data
class Volunteer {
    private int volunteerID;
    private String volunteerEmail;
    private String volunteerUser;
    private String volunteerPass;
    public String testField;
}
