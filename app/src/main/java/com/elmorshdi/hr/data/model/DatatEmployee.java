package com.elmorshdi.hr.data.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity

public class DatatEmployee implements Serializable {
    @PrimaryKey
    @NonNull
    private String name;
    private String tittle;
    private String phone;
    private int circleImage;

    public DatatEmployee(String name, String tittle, String phone, int circleImage) {
        this.name = name;
        this.tittle = tittle;
        this.phone = phone;
        this.circleImage = circleImage;
    }


    public int getCircleImage() {
        return circleImage;
    }

    public void setCircleImage(int circleImage) {
        this.circleImage = circleImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
