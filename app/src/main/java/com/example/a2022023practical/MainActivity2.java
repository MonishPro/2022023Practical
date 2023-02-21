package com.example.a2022023practical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

public class MainActivity2 extends AppCompatActivity {
private SlidrInterface slidr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        slidr=Slidr.attach(MainActivity2.this);
    }

    public void lock()
    {
        slidr.lock();
    }
    public void unlock()
    {
        slidr.unlock();
    }
}