package org.techtown.covidapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class CovidActivity extends AppCompatActivity {

    TextView text;

    String key="RFGquavKPUrcCE%2BLmZyFZ02tx6tq7lgkoevDFqgSuH%2FrZMZsdI8akZUk5Qe7tO%2FDFrAV%2FhJbr1ABTxX%2BgnBZmA%3D%3D";

    Button hospital;
    Button infection;


    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid);

        text= (TextView)findViewById(R.id.result);
        hospital = findViewById(R.id.hospital);
        infection = findViewById(R.id.infection);

        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), Hospital.class);
                startActivity(intent);
            }
        });

        infection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent infection_intent = new Intent(getApplicationContext(), Infection.class);
                startActivity(infection_intent);
            }
        });
    }



}