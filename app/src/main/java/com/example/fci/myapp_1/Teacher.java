package com.example.fci.myapp_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Teacher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
    }
    public void cstteacherbtn(View v){

        Intent i=new Intent(Teacher.this,CST_Teacher.class);
        startActivity(i);
    }
    public void dnttecherbtn(View v){

        Intent i=new Intent(Teacher.this,DNT_Teacher.class);
        startActivity(i);
    }
    public void tcttecherbtn(View v){

        Intent i=new Intent(Teacher.this,TCT_Teacher.class);
        startActivity(i);
    }
    public void rstecherbtn(View v){

        Intent i=new Intent(Teacher.this,RS_Teacher.class);
        startActivity(i);
    }
}
