package com.example.eduapp.Class;

public class Notification {

    private String Title;
    private String DateTime;
    private String Content;

    public Notification(String title, String dateTime, String content) {
        Title = title;
        DateTime = dateTime;
        Content = content;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
