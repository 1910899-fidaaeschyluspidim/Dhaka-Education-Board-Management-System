package com.example.cse213_finalproject_group36_educationboard.Tashneem_2430962;

import java.io.Serializable;

public class Message implements Serializable {
    private String messageId, senderId, category, messageText, status;

    public Message(String messageId, String senderId, String category, String messageText, String status) {
        this.messageId = messageId;
        this.senderId = senderId;
        this.category = category;
        this.messageText = messageText;
        this.status = status;
    }

    public String getMessageId() {
        return messageId;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getCategory() {
        return category;
    }

    public String getMessageText() {
        return messageText;
    }

    public String getStatus() {
        return status;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId='" + messageId + '\'' +
                ", senderId='" + senderId + '\'' +
                ", category='" + category + '\'' +
                ", messageText='" + messageText + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
