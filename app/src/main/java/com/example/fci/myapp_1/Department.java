package com.example.fci.myapp_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Department extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);
    }
    public void cstdepartment(View v){
        Intent i=new Intent(Department.this,CST_Department.class);
        startActivity(i);
    }
    public void dntdepartment(View v){
        Intent i=new Intent(Department.this,DNT_Department.class);
        startActivity(i);
    }
    public void tctdepartment(View v){
        Intent i=new Intent(Department.this,TCT_Department.class);
        startActivity(i);
    }
}
