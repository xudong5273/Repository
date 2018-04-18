package org.lostandfound.entity;

import java.util.Date;

public class Lost {
    private int lostid;
    private String lostname;
    private String classes;
    private String lostthings;
    private String lostdate;
    private String lostplace;
    private String phone;

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getLostid() {
        return lostid;
    }

    public void setLostid(int lostid) {
        this.lostid = lostid;
    }

    public String getLostname() {
        return lostname;
    }

    public void setLostname(String lostname) {
        this.lostname = lostname;
    }

    public String getLostthings() {
        return lostthings;
    }

    public void setLostthings(String lostthings) {
        this.lostthings = lostthings;
    }

    public String getLostdate() {
        return lostdate;
    }

    public void setLostdate(String lostdate) {
        this.lostdate = lostdate;
    }

    public String getLostplace() {
        return lostplace;
    }

    public void setLostplace(String lostplace) {
        this.lostplace = lostplace;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Lost{" +
                "lostid=" + lostid +
                ", lostname='" + lostname + '\'' +
                ", classes='" + classes + '\'' +
                ", lostthings='" + lostthings + '\'' +
                ", lostdate='" + lostdate + '\'' +
                ", lostplace='" + lostplace + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
