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

public class ElevenDNT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleven_dnt);


        Button mehedi = (Button) findViewById(R.id.mehedicallbtn);
        mehedi.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01851994603"));
                if (ActivityCompat.checkSelfPermission(ElevenDNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }


                startActivity(callIntent);
                */

                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(ElevenDNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(ElevenDNT.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01851994603"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01851994603"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){

                }

            }
        });
        Button topu = (Button) findViewById(R.id.topucallbtn);
        topu.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01751176502"));
                if (ActivityCompat.checkSelfPermission(ElevenDNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }


                startActivity(callIntent);
                */

                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(ElevenDNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(ElevenDNT.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01751176502"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01751176502"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){

                }


            }
        });
        Button joy = (Button) findViewById(R.id.joycallbtn);
        joy.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01625476051"));
                if (ActivityCompat.checkSelfPermission(ElevenDNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }


                startActivity(callIntent);
                */

                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(ElevenDNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(ElevenDNT.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01625476051"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01625476051"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){

                }


            }
        });
        Button shihab = (Button) findViewById(R.id.shihabcallbtn);
        shihab.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01627683124"));
                if (ActivityCompat.checkSelfPermission(ElevenDNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }


                startActivity(callIntent);
                */

                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(ElevenDNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(ElevenDNT.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01627683124"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01627683124"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){

                }


            }
        });
    }
}
