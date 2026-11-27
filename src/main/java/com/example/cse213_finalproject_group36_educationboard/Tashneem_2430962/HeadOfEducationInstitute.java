package com.example.cse213_finalproject_group36_educationboard.Tashneem_2430962;

import com.example.cse213_finalproject_group36_educationboard.User;

public class HeadOfEducationInstitute extends User {
    private String eiin, instituteName;

    public HeadOfEducationInstitute(String userName, String userEmail, String userId, String password,
                                    String eiin, String instituteName) {
        super(userName, userEmail, userId, password);
        this.eiin = eiin;
        this.instituteName = instituteName;
    }

    public String getEiin() {
        return eiin;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setEiin(String eiin) {
        this.eiin = eiin;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    @Override
    public String toString() {
        return "HeadOfEducationInstitute{" +
                "eiin='" + eiin + '\'' +
                ", instituteName='" + instituteName + '\'' +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
