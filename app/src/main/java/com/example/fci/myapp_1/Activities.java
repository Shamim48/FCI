package com.example.fci.myapp_1;

import android.content.Intent;
import android.icu.text.RuleBasedCollator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);
        Button button=(Button)findViewById(R.id.industryvisite);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),Industry_Visit.class);
                startActivity(i);
            }
        });
    }
    public void blood(View v){
        Intent i=new Intent(Activities.this,Blood_donation.class);
        startActivity(i);
    }
    public void scout(View v){
        Intent i=new Intent(Activities.this,Rubar_Scout.class);
        startActivity(i);
    }
    public void libary(View v){
        Intent i=new Intent(Activities.this,FCI_Libary.class);
        startActivity(i);
    }
    public void clubs(View v){
        Intent i=new Intent(Activities.this,Clubs.class);
        startActivity(i);
    }
    public void industryvisit(View v){
        Intent i=new Intent(Activities.this,Industry_Visit.class);
        startActivity(i);
    }
  /* Button button=(Button)findViewById(R.id.industryvisite);
        button.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            Intent i = new Intent(getApplicationContext(),Industry_Visit.class);
            startActivity(i);
        }
    });
*/
 /*  Button btn = (Button) findViewById(R.id.industryvisite);

btn.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            Intent myIntent = new Intent(Activities.this, Industry_Visit.class);
            MainActivity.this.startActivity(myIntent);
        }
    });
*/
    public void studentattactment(View v){

        Intent i=new Intent(Activities.this,Student_attactment.class);
        startActivity(i);
    }

}
