package com.example.eduapp.Model;

public class Permission {
    private int idPermission;
    private String namePermission;

    public Permission() {
    }

    public Permission(int idPermission, String namePermission) {
        this.idPermission = idPermission;
        this.namePermission = namePermission;
    }

    public int getIdPermission() {
        return idPermission;
    }

    public void setIdPermission(int idPermission) {
        this.idPermission = idPermission;
    }

    public String getNamePermission() {
        return namePermission;
    }

    public void setNamePermission(String namePermission) {
        this.namePermission = namePermission;
    }
}
