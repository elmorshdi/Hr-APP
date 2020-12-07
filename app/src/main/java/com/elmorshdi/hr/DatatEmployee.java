package com.elmorshdi.hr;

import java.io.Serializable;

public class DatatEmployee implements Serializable {

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

    public DatatEmployee(String name, String tittle) {
        this.name = name;
        this.tittle = tittle;
    }

    public DatatEmployee(String name, String tittle, String phone) {
        this.name = name;
        this.tittle = tittle;
        this.phone = phone;
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
