package com.farm.entity;

public class Crops {
    private Integer id;

    private String cropsname;

    private Integer area;

    private Integer profit;

    private Integer cropstime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCropsname() {
        return cropsname;
    }

    public void setCropsname(String cropsname) {
        this.cropsname = cropsname == null ? null : cropsname.trim();
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getProfit() {
        return profit;
    }

    public void setProfit(Integer profit) {
        this.profit = profit;
    }

    public Integer getCropstime() {
        return cropstime;
    }

    public void setCropstime(Integer cropstime) {
        this.cropstime = cropstime;
    }
}