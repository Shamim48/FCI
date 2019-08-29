package com.example.fci.myapp_1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Class_routine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_routine);
    }

   public void cst(View v){
       Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fci.gov.bd/index.php?page=class-routine&department=DEPT-001"));
       startActivity(i);
   }
    public void dnt(View v){
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fci.gov.bd/index.php?page=class-routine&department=DEPT-002"));
        startActivity(i);
    }
    public void tct(View v){
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fci.gov.bd/index.php?page=class-routine&department=DEPT-003"));
        startActivity(i);
    }
}
