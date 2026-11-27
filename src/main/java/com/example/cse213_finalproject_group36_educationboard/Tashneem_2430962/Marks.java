package com.example.cse213_finalproject_group36_educationboard.Tashneem_2430962;

import java.io.Serializable;

public class Marks implements Serializable {
    private String marksId, studentId, subject;
    private float marks;

    public Marks(String marksId, String studentId, String subject, float marks) {
        this.marksId = marksId;
        this.studentId = studentId;
        this.subject = subject;
        this.marks = marks;
    }

    public String getMarksId() {
        return marksId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getSubject() {
        return subject;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarksId(String marksId) {
        this.marksId = marksId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "marksId='" + marksId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", subject='" + subject + '\'' +
                ", marks=" + marks +
                '}';
    }
}
