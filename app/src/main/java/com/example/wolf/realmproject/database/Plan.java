package com.example.wolf.realmproject.database;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Wolf on 20.10.2017.
 */

public class Plan extends RealmObject {
    @PrimaryKey
    private long id;
    private String planName;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }
}
