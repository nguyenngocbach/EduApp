package com.example.eduapp.Model;

public class Children {
    private int id;
    private String name;
    private String img;
    private boolean check;

    public Children() {
    }

    public Children(int id, String name, String img, boolean check) {
        this.id = id;
        this.name = name;
        this.img = img;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
