package com.example.fci.myapp_1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Campus_map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus_map);
    }
    public void campussmap(View v){
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Feni+Computer+Institute/@23.02859,91.423237,2692m/data=!3m1!1e3!4m5!3m4!1s0x0:0xe1c12206d8f619e0!8m2!3d23.0345534!4d91.4193321?hl=en-US"));
        startActivity(i);
    }
}
