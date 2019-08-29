package com.example.fci.myapp_1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Routine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine);
    }
    public void classroutine(View v){
        Intent i=new Intent(Routine.this,Classroutine.class);
        startActivity(i);
    }
    public void examroutine(View v){
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://diplomabd.com/bteb-exam-routine/"));
        startActivity(i);
    }
}
