package com.example.fci.myapp_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DNT_CR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dnt__cr);
    }
    public void elevendnt(View v){
        Intent i=new Intent(DNT_CR.this,ElevenDNT.class);
        startActivity(i);
    }

    public void thirteendnt(View v){
        Intent i=new Intent(DNT_CR.this,Thirteen_DNT.class);
        startActivity(i);
    }
    /*
    public void dntsec(View v){

        Intent i=new Intent(DNT_CR.this,TuelveDNT.class);
        startActivity(i);
    }

    */
    public void dntsec(View v)
    {
        Intent intent = new Intent(getApplicationContext(), Tuelvebatch_DNT.class);
        startActivity(intent);
    }
    public void tendntcr(View v){
        Intent i=new Intent(DNT_CR.this,Tenbatch_DNT.class);
        startActivity(i);
    }

}

