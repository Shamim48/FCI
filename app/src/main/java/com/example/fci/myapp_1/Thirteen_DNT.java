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

public class Thirteen_DNT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteen__dnt);


        Button arbi = (Button) findViewById(R.id.arbicallbtn);
        arbi.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0188225246"));
                if (ActivityCompat.checkSelfPermission(Thirteen_DNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }


                startActivity(callIntent);

                */

                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(Thirteen_DNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(Thirteen_DNT.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:0188225246"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:0188225246"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){

                }


            }
        });

        Button sharma = (Button) findViewById(R.id.sharmacallbtn);
        sharma.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01830540932"));
                if (ActivityCompat.checkSelfPermission(Thirteen_DNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }


                startActivity(callIntent);

                */

                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(Thirteen_DNT.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(Thirteen_DNT.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01830540932"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01830540932"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){

                }


            }
        });




    }
}
