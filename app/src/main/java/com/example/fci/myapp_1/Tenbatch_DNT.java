package com.example.fci.myapp_1;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.content.pm.PackageManager.PERMISSION_GRANTED;

public class Tenbatch_DNT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenbatch__dnt);


        Button alam = (Button) findViewById(R.id.alamcallbtn);
        alam.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01875824204"));
                if (ActivityCompat.checkSelfPermission(Tenbatch_DNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }


                startActivity(callIntent);
                */

                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(Tenbatch_DNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(Tenbatch_DNT.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01875824204"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01875824204"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){

                }


            }
        });
        Button kawsar = (Button) findViewById(R.id.kawsarcallbtn);
        kawsar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01861143333"));
                if (ActivityCompat.checkSelfPermission(Tenbatch_DNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }


                startActivity(callIntent);

                */
                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(Tenbatch_DNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(Tenbatch_DNT.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01861143333"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01861143333"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){

                }


            }
        });
    }
}
