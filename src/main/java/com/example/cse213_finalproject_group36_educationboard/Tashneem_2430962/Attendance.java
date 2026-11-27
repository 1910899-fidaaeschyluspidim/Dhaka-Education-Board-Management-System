package com.example.cse213_finalproject_group36_educationboard.Tashneem_2430962;

import java.io.Serializable;
import java.time.LocalDate;

public class Attendance implements Serializable {
    private String attendanceId, studentId, status;
    private LocalDate date;

    public Attendance(String attendanceId, String studentId, String status, LocalDate date) {
        this.attendanceId = attendanceId;
        this.studentId = studentId;
        this.status = status;
        this.date = date;
    }

    public String getAttendanceId() {
        return attendanceId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setAttendanceId(String attendanceId) {
        this.attendanceId = attendanceId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "attendanceId='" + attendanceId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", status='" + status + '\'' +
                ", date=" + date +
                '}';
    }
}
