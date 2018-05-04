package com.farm.entity;

public class Field {
    private Integer id;
    private Integer area;
    private String crops;

    public Field() {

    }

    public Field(Integer id, Integer area) {
        this.id = id;
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getCrops() {
        return crops;
    }

    public void setCrops(String crops) {
        this.crops = crops;
    }

}
