package com.khoudourmohamedelamine.hp.blood_d;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Start_A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_);
    }

    public void Start(View view)
    {
        Intent i1=new Intent(this,Desc_A.class);
        startActivity(i1);
    }
}
