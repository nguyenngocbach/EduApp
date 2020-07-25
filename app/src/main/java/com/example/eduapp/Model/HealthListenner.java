package com.example.eduapp.Model;

import com.example.eduapp.Class.Children;

public interface HealthListenner {
    void reviewHealthChildren(Children children);
    void updateHealthChildren(Children children);
    void deleteChildren(Children children);
}
