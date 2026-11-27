package com.example.cse213_finalproject_group36_educationboard;

public abstract class User {
    protected String userName;
    protected String userEmail;
    protected String userId;
    protected String password;

    public User(String userName, String userEmail, String userId, String password) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userId = userId;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }




}
