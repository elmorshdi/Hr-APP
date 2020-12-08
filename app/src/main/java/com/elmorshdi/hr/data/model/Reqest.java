package com.elmorshdi.hr.data.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Reqest {
    @PrimaryKey
    @NonNull
    String reason;
    String startday;
    String numberOfDay;
    String manger;

    public Reqest(String manger, String reason, String startday, String numberOfDay) {
        this.manger = manger;
        this.reason = reason;
        this.startday = startday;
        this.numberOfDay = numberOfDay;
    }

    public String getManger() {
        return manger;
    }

    public void setManger(String manger) {
        this.manger = manger;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStartday() {
        return startday;
    }

    public void setStartday(String startday) {
        this.startday = startday;
    }

    public String getNumberOfDay() {
        return numberOfDay;
    }

    public void setNumberOfDay(String numberOfDay) {
        this.numberOfDay = numberOfDay;
    }
}
