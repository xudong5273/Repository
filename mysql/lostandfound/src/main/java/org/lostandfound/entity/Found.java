package org.lostandfound.entity;

import java.util.Date;

public class Found {
    private int foundid;
    private String foundname;
    private String classes;
    private String foundthings;
    private String founddate;
    private String foundplace;
    private String phone;

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getFoundid() {
        return foundid;
    }

    public void setFoundid(int foundid) {
        this.foundid = foundid;
    }

    public String getFoundname() {
        return foundname;
    }

    public void setFoundname(String foundname) {
        this.foundname = foundname;
    }

    public String getFoundthings() {
        return foundthings;
    }

    public void setFoundthings(String foundthings) {
        this.foundthings = foundthings;
    }

    public String getFounddate() {
        return founddate;
    }

    public void setFounddate(String founddate) {
        this.founddate = founddate;
    }

    public String getFoundplace() {
        return foundplace;
    }

    public void setFoundplace(String foundplace) {
        this.foundplace = foundplace;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "Found{" +
                "foundid=" + foundid +
                ", foundname='" + foundname + '\'' +
                ", classes='" + classes + '\'' +
                ", foundthings='" + foundthings + '\'' +
                ", founddate='" + founddate + '\'' +
                ", foundplace='" + foundplace + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
