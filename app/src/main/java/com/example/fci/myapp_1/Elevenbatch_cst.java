package com.example.fci.myapp_1;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.content.pm.PackageManager.*;
import static com.example.fci.myapp_1.R.id.farukb;

public class Elevenbatch_cst extends AppCompatActivity {
    public Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elevenbatch_cst);

        btn = (Button) findViewById(R.id.masudb);
        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01876155755"));



                if (ActivityCompat.checkSelfPermission(Elevenbatch_cst.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }

                startActivity(callIntent);
                */
                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(Elevenbatch_cst.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(Elevenbatch_cst.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01876155755"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01876155755"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){

                }

            }
        });
        // startActivity(callfaruk);
        Button farukbtn = (Button) findViewById(R.id.farukb);
        farukbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                /*
                Intent callfaruk = new Intent(Intent.ACTION_CALL);
                callfaruk.setData(Uri.parse("tel:01881320833"));
                if (ActivityCompat.checkSelfPermission(Elevenbatch_cst.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }

                // startActivity(callIntent);
                startActivity(callfaruk);
                */

                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(Elevenbatch_cst.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(Elevenbatch_cst.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01881320833"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01881320833"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){

                }

            }
        });
        Button soikotbtn = (Button) findViewById(R.id.soikotb);
        soikotbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01851786118"));
                if (ActivityCompat.checkSelfPermission(Elevenbatch_cst.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }

                // startActivity(callIntent);
                startActivity(callIntent);

*/
                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(Elevenbatch_cst.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(Elevenbatch_cst.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01851786118"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01851786118"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){

                }

            }
        });
        Button halimbtn = (Button) findViewById(R.id.halimb);
        halimbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01836683752"));
                if (ActivityCompat.checkSelfPermission(Elevenbatch_cst.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }


                startActivity(callIntent);
                */

                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(Elevenbatch_cst.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(Elevenbatch_cst.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01836683752"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01836683752"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){

                }

            }
        });


    }
}