package com.example.cse213_finalproject_group36_educationboard.Tashneem_2430962;

import java.io.Serializable;

public class Registration implements Serializable {
    private String registrationId, studentId, name, rollNo, exam, subject, status;

    public Registration(String registrationId, String studentId, String name, String rollNo, String exam, String subject, String status) {
        this.registrationId = registrationId;
        this.studentId = studentId;
        this.name = name;
        this.rollNo = rollNo;
        this.exam = exam;
        this.subject = subject;
        this.status = status;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getExam() {
        return exam;
    }

    public String getSubject() {
        return subject;
    }

    public String getStatus() {
        return status;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "registrationId='" + registrationId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", exam='" + exam + '\'' +
                ", subject='" + subject + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
