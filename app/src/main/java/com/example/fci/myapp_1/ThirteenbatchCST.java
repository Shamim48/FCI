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

public class ThirteenbatchCST extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteenbatch_cst);


        Button taleb = (Button) findViewById(R.id.talebcallb);

        taleb.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01995877197"));
                if (ActivityCompat.checkSelfPermission(ThirteenbatchCST.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }


                startActivity(callIntent);

                */

                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(ThirteenbatchCST.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(ThirteenbatchCST.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01995877197"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01995877197"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){

                }


            }
        });
        Button sufian = (Button) findViewById(R.id.sufiancallb);

        sufian.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01619241328"));
                if (ActivityCompat.checkSelfPermission(ThirteenbatchCST.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }


                startActivity(callIntent);
                */

                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(ThirteenbatchCST.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(ThirteenbatchCST.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01619241328"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01619241328"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){

                }


            }
        });
        Button nijam = (Button) findViewById(R.id.nijamcallb);

        nijam.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01835006682"));
                if (ActivityCompat.checkSelfPermission(ThirteenbatchCST.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }


                startActivity(callIntent);
                */

                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(ThirteenbatchCST.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(ThirteenbatchCST.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01835006682"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01835006682"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){

                }


            }
        });

    }
}
