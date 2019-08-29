package com.example.fci.myapp_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Classct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classct);
    }
    public void crcst(View v){
        Intent i=new Intent(Classct.this,CSTClasscr.class);
        startActivity(i);
    }
    public void crdnt(View v){
        Intent i=new Intent(Classct.this,DNT_CR.class);
        startActivity(i);
    }
    public void crtct(View v){
        Intent i=new Intent(Classct.this,TCT_CR.class);
        startActivity(i);
    }
}
