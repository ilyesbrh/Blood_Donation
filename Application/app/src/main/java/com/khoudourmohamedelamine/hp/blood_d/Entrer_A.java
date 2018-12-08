package com.khoudourmohamedelamine.hp.blood_d;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Entrer_A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrer_);
    }

    public void Login(View view) {
        Intent i2=new Intent(this,Insc_A.class);
        startActivity(i2);
    }
}
