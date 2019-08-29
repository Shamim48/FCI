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

public class Contact_SEIP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact__seip);

        Button manik = (Button) findViewById(R.id.manikcallbtn);
        Button helalsir = (Button) findViewById(R.id.hehalsirseipb);
        helalsir.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(Contact_SEIP.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(Contact_SEIP.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01815645223"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01815645223"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){


                }

            }

        });
        Button younus = (Button) findViewById(R.id.younussircallb);
        younus.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(Contact_SEIP.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(Contact_SEIP.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01858888797"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01858888797"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){


                }

            }

        });

        manik.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(Contact_SEIP.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(Contact_SEIP.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01843167798"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01843167798"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){


                }

            }

        });
        Button nahar = (Button) findViewById(R.id.naharcallbt);
        nahar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(Contact_SEIP.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(Contact_SEIP.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01831939225"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01831939225"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){


                }

            }

        });
        Button farukbai = (Button) findViewById(R.id.sumifarukcallbtn);
        farukbai.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(Contact_SEIP.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(Contact_SEIP.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01682812929"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01682812929"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){


                }

            }

        });
    }
}
