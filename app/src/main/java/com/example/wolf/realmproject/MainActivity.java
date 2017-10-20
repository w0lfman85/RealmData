package com.example.wolf.realmproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.wolf.realmproject.database.Plan;
import com.example.wolf.realmproject.database.TablesPlan;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.annotations.RealmModule;

import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Realm.init(this);

        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
                .name("myrealm.realm")
                .schemaVersion(1)
        //        .modules(new TablesPlan())
                .build();

        Realm realm = Realm.getInstance(realmConfiguration);

        realm.copyToRealm(new TablesPlan(0.5,1,"hectare", 36650,6548,new Plan()));



    }
}
