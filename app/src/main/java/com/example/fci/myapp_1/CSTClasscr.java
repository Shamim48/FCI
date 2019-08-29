package com.example.fci.myapp_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CSTClasscr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cstclasscr);
    }

    public void eleven(View v) {
        Intent i = new Intent(CSTClasscr.this, Elevenbatch_cst.class);
       startActivity(i);
    }
    public void tuelve(View v) {
        Intent i = new Intent(CSTClasscr.this, Tuelvebatchcst.class);
        startActivity(i);
    }
    public void thirteen(View v) {
        Intent i = new Intent(CSTClasscr.this, ThirteenbatchCST.class);
        startActivity(i);
    }
    public void tenctscr(View v){
        Intent i=new Intent(CSTClasscr.this,Tenbatchcst.class);
        startActivity(i);
    }

}