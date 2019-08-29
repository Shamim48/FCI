package com.example.fci.myapp_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About_SEIP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__seip);

        Button button=(Button)findViewById(R.id.contactseipslkfk);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),Contact_SEIP.class);
                startActivity(i);
            }
        });
    }
  public void seipcontact(View v){
      Intent i=new Intent(About_SEIP.this,Contact_SEIP.class);
      startActivity(i);
  }
    }

