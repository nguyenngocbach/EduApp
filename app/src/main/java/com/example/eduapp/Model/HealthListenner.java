package com.example.eduapp.Model;

public interface HealthListenner {
    void reviewHealthChildren(Children children);
    void updateHealthChildren(Children children);
    void deleteChildren(Children children);
}
