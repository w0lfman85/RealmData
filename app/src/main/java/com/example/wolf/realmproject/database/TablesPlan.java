package com.example.wolf.realmproject.database;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class TablesPlan extends RealmObject {
    @PrimaryKey
    private long id;
    private double minValue;
    private double maxValue;
    private String naturalIndex;
    private int fixedCostsA;
    private int fixedCostsB;
    private Plan plan;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getMinValue() {
        return minValue;
    }

    public void setMinValue(double minValue) {
        this.minValue = minValue;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public String getNaturalIndex() {
        return naturalIndex;
    }

    public void setNaturalIndex(String naturalIndex) {
        this.naturalIndex = naturalIndex;
    }

    public int getFixedCostsA() {
        return fixedCostsA;
    }

    public void setFixedCostsA(int fixedCostsA) {
        this.fixedCostsA = fixedCostsA;
    }

    public int getFixedCostsB() {
        return fixedCostsB;
    }

    public void setFixedCostsB(int fixedCostsB) {
        this.fixedCostsB = fixedCostsB;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public TablesPlan(double minValue, double maxValue, String naturalIndex, int fixedCostsA,
                      int fixedCostsB, Plan plan) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.naturalIndex = naturalIndex;
        this.fixedCostsA = fixedCostsA;
        this.fixedCostsB = fixedCostsB;
        this.plan = plan;
    }
    public TablesPlan (){}
}
