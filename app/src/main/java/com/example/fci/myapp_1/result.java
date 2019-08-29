package com.example.fci.myapp_1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }
    public void academicresult(View v){
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fci.gov.bd/result.php"));
        startActivity(i);
    }
    public void boardresult(View v){
        Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://sites.google.com/site/resultbteb/published-result/diploma-engg"));
        startActivity(i);
    }
}
