package com.example.cse213_finalproject_group36_educationboard.Tashneem_2430962;

import java.io.Serializable;
import java.time.LocalDate;

public class Request implements Serializable {
    private String requestId, studentId, handledBy, requestType, details, status, remarks;
    private int candidates;
    private LocalDate requestDate;

    public Request(String requestId, String studentId, String handledBy, String requestType, String details, String status, String remarks, int candidates, LocalDate requestDate) {
        this.requestId = requestId;
        this.studentId = studentId;
        this.handledBy = handledBy;
        this.requestType = requestType;
        this.details = details;
        this.status = status;
        this.remarks = remarks;
        this.candidates = candidates;
        this.requestDate = requestDate;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getHandledBy() {
        return handledBy;
    }

    public String getRequestType() {
        return requestType;
    }

    public String getDetails() {
        return details;
    }

    public String getStatus() {
        return status;
    }

    public String getRemarks() {
        return remarks;
    }

    public int getCandidates() {
        return candidates;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setHandledBy(String handledBy) {
        this.handledBy = handledBy;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setCandidates(int candidates) {
        this.candidates = candidates;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestId='" + requestId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", handledBy='" + handledBy + '\'' +
                ", requestType='" + requestType + '\'' +
                ", details='" + details + '\'' +
                ", status='" + status + '\'' +
                ", remarks='" + remarks + '\'' +
                ", candidates=" + candidates +
                ", requestDate=" + requestDate +
                '}';
    }
}
