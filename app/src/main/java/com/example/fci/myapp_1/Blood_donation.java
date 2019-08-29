package com.example.fci.myapp_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Blood_donation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_donation);
    }
    public void bloodcontact(View v){
        Intent i=new Intent(Blood_donation.this,Contact_Blood.class);
        startActivity(i);
    }
}
