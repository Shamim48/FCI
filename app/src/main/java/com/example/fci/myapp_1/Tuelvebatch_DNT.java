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

public class Tuelvebatch_DNT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuelvebatch__dnt);



        Button komal = (Button) findViewById(R.id.komalcallbtn);
        komal.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01874303467"));
                if (ActivityCompat.checkSelfPermission(Tuelvebatch_DNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }


                startActivity(callIntent);
                */
                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(Tuelvebatch_DNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(Tuelvebatch_DNT.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01874303467"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01874303467"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){

                }


            }
        });
        Button rahman = (Button) findViewById(R.id.Rahmancallbtn);
        rahman.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01818988451"));
                if (ActivityCompat.checkSelfPermission(Tuelvebatch_DNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }


                startActivity(callIntent);
                */

                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(Tuelvebatch_DNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(Tuelvebatch_DNT.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01818988451"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01818988451"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){

                }


            }
        });
        Button fakhrul = (Button) findViewById(R.id.fakhrulcallbtn);
        fakhrul.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01827811219"));
                if (ActivityCompat.checkSelfPermission(Tuelvebatch_DNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }


                startActivity(callIntent);
                */

                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(Tuelvebatch_DNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(Tuelvebatch_DNT.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01827811219"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01827811219"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){

                }


            }
        });

        /*
        Button jahid=(Button) findViewById(R.id.anisulcallbtn);
        jahid.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent callintent=new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel: 01869653016"));
                if(ActivityCompat.checkSelfPermission(Tuelvebatch_DNT.this,Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED)){
                    return;
                }
                startActivity(callintent);

            }

        });


        */
        Button anisul = (Button) findViewById(R.id.anisulcallbtn);
        anisul.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01869653016"));
                if (ActivityCompat.checkSelfPermission(Tuelvebatch_DNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }


                startActivity(callIntent);

                */

                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(Tuelvebatch_DNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(Tuelvebatch_DNT.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01869653016"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01869653016"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){

                }


            }
        });

    }
}
