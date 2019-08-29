package com.example.fci.myapp_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TCT_CR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tct__cr);
    }
    public void tctfirstbatch(View v){
        Intent i=new Intent(TCT_CR.this,First_TCT.class);
        startActivity(i);
        /*Intent i=new Intent(TCT_CR.this,First_TCT.class);
        startActivity(i);
        */
    }
    public void secondtct(View v){
        Intent i=new Intent(TCT_CR.this,Second_TCT.class);
        startActivity(i);
    }
}
