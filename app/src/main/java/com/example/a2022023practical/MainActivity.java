package com.example.a2022023practical;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrConfig;
import com.r0adkll.slidr.model.SlidrInterface;
import com.r0adkll.slidr.model.SlidrPosition;

public class MainActivity extends AppCompatActivity {
private TextView textView;
private Button Changecolor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        Changecolor=findViewById(R.id.button);

        SlidrConfig config = new SlidrConfig.Builder().position(SlidrPosition.RIGHT).build();
        Slidr.attach(this,config);

        //I tried putting Slidr.attach(MainActivity2.class) here above instead of this,but it shows error


        Changecolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(Color.RED);
                Intent i=new Intent(getApplicationContext(),MainActivity2.class);

                Toast.makeText(MainActivity.this, "Clicking on this button will also go to next activity a;ong with changing its color", Toast.LENGTH_SHORT).show();

                startActivity(i);
            }
            //Mam try swiping the slides in both the activities ,when you swipe on this activity,it will go back to homescreen
        });

    }
}