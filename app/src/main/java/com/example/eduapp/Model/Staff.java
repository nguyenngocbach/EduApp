package com.example.eduapp.Model;

public class Staff {
    private int id;
    private String name;
    private String imgStaff;
    private boolean check=false;

    public Staff(int id, String name, String imgStaff, boolean check) {
        this.id = id;
        this.name = name;
        this.imgStaff = imgStaff;
        this.check = check;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgStaff() {
        return imgStaff;
    }

    public void setImgStaff(String imgStaff) {
        this.imgStaff = imgStaff;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
