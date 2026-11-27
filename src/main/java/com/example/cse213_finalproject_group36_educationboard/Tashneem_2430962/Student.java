package com.example.cse213_finalproject_group36_educationboard.Tashneem_2430962;

import com.example.cse213_finalproject_group36_educationboard.User;

public class Student extends User {
    private String subject, rollNo, addedBy, status;

    public Student(String userName, String userEmail, String userId, String password,
                   String subject, String rollNo, String addedBy, String status){
        super(userName, userEmail, userId, password);
        this.subject = subject;
        this.rollNo = rollNo;
        this.addedBy = addedBy;
        this.status = status;
    }

    public String getSubject() {
        return subject;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public String getStatus() {
        return status;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "subject='" + subject + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", addedBy='" + addedBy + '\'' +
                ", status='" + status + '\'' +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
