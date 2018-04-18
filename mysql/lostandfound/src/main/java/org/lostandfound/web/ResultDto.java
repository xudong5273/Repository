package org.lostandfound.web;

public class ResultDto {

    private String classess;

    private int lostcount;

    private int foundcount;

    @Override
    public String toString() {
        return "ResultDto{" +
                "classess='" + classess + '\'' +
                ", lostcount=" + lostcount +
                ", foundcount=" + foundcount +
                '}';
    }

    public String getClassess() {
        return classess;
    }

    public void setClassess(String classess) {
        this.classess = classess;
    }

    public int getLostcount() {
        return lostcount;
    }

    public void setLostcount(int lostcount) {
        this.lostcount = lostcount;
    }

    public int getFoundcount() {
        return foundcount;
    }

    public void setFoundcount(int foundcount) {
        this.foundcount = foundcount;
    }
}
