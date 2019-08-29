
package com.example.fci.myapp_1;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class  MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void aboutfci(View v){

        Intent i=new Intent(MainActivity.this,Aboutfci.class);
        startActivity(i);
    }
    public void department(View v){

        Intent i=new Intent(MainActivity.this,Department.class);
        startActivity(i);
    }
    public void principal(View v){

        Intent i=new Intent(MainActivity.this,Principal.class);
        startActivity(i);
    }
    public void teacherb(View v){

        Intent i=new Intent(MainActivity.this,Teacher.class);
        startActivity(i);
    }
    public void classcrb(View v){

        Intent i=new Intent(MainActivity.this,Classct.class);
        startActivity(i);
    }
    public void staffci(View v){

        Intent i=new Intent(MainActivity.this,Staf.class);
        startActivity(i);
    }
    public void activitesb(View v){
        Intent i=new Intent(MainActivity.this,Activities.class);
        startActivity(i);
    }
    public void hostelb(View v){
        Intent i=new Intent(MainActivity.this,hostel.class);
        startActivity(i);
    }
    public void contact(View v){
        Intent i=new Intent(MainActivity.this,contact.class);
        startActivity(i);
    }
    public void result(View v){
        Intent i=new Intent(MainActivity.this,result.class);
        startActivity(i);
    }
    public void campussmap(View v){
        Intent i=new Intent(MainActivity.this,Campus_map.class);
        startActivity(i);
    }
    public void aboutseip(View v){
        Intent i=new Intent(MainActivity.this,About_SEIP.class);
        startActivity(i);
    }
    public void aboutus(View v){
        Intent i=new Intent(MainActivity.this,About_US.class);
        startActivity(i);
    }
public void fciwebsite(View v){
    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fci.gov.bd/"));
    startActivity(i);
}

    public void noticeboard(View v){
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fci.gov.bd/"));
        startActivity(i);
    }
    public void routine(View v){
        Intent i=new Intent(MainActivity.this,Routine.class);
        startActivity(i);
    }

}
