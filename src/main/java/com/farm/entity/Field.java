package com.farm.entity;

public class Field {
    private int id;
    private int area;
    private String[] crops;

    public Field() {

    }

    public Field(int id, int area) {
        this.id = id;
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
