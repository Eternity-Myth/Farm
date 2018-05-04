package com.farm.entity;

public class Crops {
    private int id;
    private String cropsName;
    private int area;
    private int profit;
    private int cropsTime;

    public Crops() {

    }

    public Crops(int id, String cropsName) {
        this.id = id;
        this.cropsName = cropsName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCropsName() {
        return cropsName;
    }

    public void setCropsName(String cropsName) {
        this.cropsName = cropsName;
    }


    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public int getCropsTime() {
        return cropsTime;
    }

    public void setCropsTime(int cropsTime) {
        this.cropsTime = cropsTime;
    }
}
