package com.example.fci.myapp_1;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.content.pm.PackageManager.PERMISSION_GRANTED;

public class CST_Teacher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cst__teacher);

        Button afrujamam = (Button) findViewById(R.id.afrujamamcallbtn);
        afrujamam.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(CST_Teacher.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(CST_Teacher.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01945367435"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01945367435"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){


                }

            }

        });
        Button shamimsir = (Button) findViewById(R.id.shamimsircallbt);
        shamimsir.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

               /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01813243436"));
                if (ActivityCompat.checkSelfPermission(CST_Teacher.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }


                startActivity(callIntent);
                */
                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(CST_Teacher.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(CST_Teacher.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01813243436"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01813243436"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){


                }

            }
        });
        Button nakibsir = (Button) findViewById(R.id.nakibsircallbtn);
        nakibsir.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01710020761"));
                if (ActivityCompat.checkSelfPermission(CST_Teacher.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }


                startActivity(callIntent);

            }
        });
        Button nahelsir = (Button) findViewById(R.id.nahelsircallbtn);
        nahelsir.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:017629927719"));
                if (ActivityCompat.checkSelfPermission(CST_Teacher.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }


                startActivity(callIntent);

                */
                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(CST_Teacher.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(CST_Teacher.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:017629927719"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:017629927719"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){


                }

            }
        });
        Button suhelsir = (Button) findViewById(R.id.sohelsircallbtn);
        suhelsir.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01625225586"));
                if (ActivityCompat.checkSelfPermission(CST_Teacher.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }


                startActivity(callIntent);

                */
                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(CST_Teacher.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(CST_Teacher.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01625225586"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01625225586"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){


                }


            }
        });
        Button molymam = (Button) findViewById(R.id.molimamcallbtn);
        molymam.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01776290973"));
                if (ActivityCompat.checkSelfPermission(CST_Teacher.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }


                startActivity(callIntent);

                */
                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(CST_Teacher.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(CST_Teacher.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01776290973"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01776290973"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){


                }



            }
        });
        Button riyadsir = (Button) findViewById(R.id.riadsircallbtn);
        riyadsir.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01836167960"));
                if (ActivityCompat.checkSelfPermission(CST_Teacher.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }


                startActivity(callIntent);


*/
                try{
                    if (Build.VERSION.SDK_INT >18 ){

                        if (ActivityCompat.checkSelfPermission(CST_Teacher.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                            ActivityCompat.requestPermissions(CST_Teacher.this,new String[]{Manifest.permission.CALL_PHONE},101);
                            return;
                        }
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01812986727"));
                        startActivity(callIntent);


                    }
                    else {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:01812986727"));
                        startActivity(callIntent);
                    }

                }
                catch (Exception e){


                }

            }
        });
        Button riktamam = (Button) findViewById(R.id.riktamamcallb);
        riktamam.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                /*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01945367435"));
                if (ActivityCompat.checkSelfPermission(CST_Teacher.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                    return;
                }


                startActivity(callIntent);

*/    try {
                if (Build.VERSION.SDK_INT > 18) {

                    if (ActivityCompat.checkSelfPermission(CST_Teacher.this, Manifest.permission.CALL_PHONE) != PERMISSION_GRANTED) {

                        ActivityCompat.requestPermissions(CST_Teacher.this, new String[]{Manifest.permission.CALL_PHONE}, 101);
                        return;
                    }
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:01945367435"));
                    startActivity(callIntent);


                } else {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:01945367435"));
                    startActivity(callIntent);
                }

            }
                catch(Exception e){


                }
            }

        });

    }


}
