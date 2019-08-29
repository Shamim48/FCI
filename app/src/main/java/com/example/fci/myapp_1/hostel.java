package com.example.fci.myapp_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class hostel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostel);
    }
    public void boyshostel(View v){
        Intent i=new Intent(hostel.this,Boyes_hostel.class);
        startActivity(i);
    }
    public void girlshostel(View v){
        Intent i=new Intent(hostel.this,Girlshostel.class);
        startActivity(i);
    }
}
