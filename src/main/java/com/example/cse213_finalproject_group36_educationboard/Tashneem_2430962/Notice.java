package com.example.cse213_finalproject_group36_educationboard.Tashneem_2430962;

import java.io.Serializable;
import java.time.LocalDate;

public class Notice implements Serializable {
    private String noticeId, postedBy, title, message;
    private LocalDate noticeDate;

    public Notice(String noticeId, String postedBy, String title, String message, LocalDate noticeDate) {
        this.noticeId = noticeId;
        this.postedBy = postedBy;
        this.title = title;
        this.message = message;
        this.noticeDate = noticeDate;
    }

    public String getNoticeId() {
        return noticeId;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public LocalDate getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setNoticeDate(LocalDate noticeDate) {
        this.noticeDate = noticeDate;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "noticeId='" + noticeId + '\'' +
                ", postedBy='" + postedBy + '\'' +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", noticeDate=" + noticeDate +
                '}';
    }
}
