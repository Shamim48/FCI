package com.example.fci.myapp_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }
    public void teachercontact(View v){
        Intent i=new Intent(contact.this,Teacher.class);
        startActivity(i);
    }
    public void staffcontact(View v){
        Intent i=new Intent(contact.this,Staf.class);
        startActivity(i);
    }
}
