package com.example.broadcastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String I_AM_HOME = "com.example.I_AM_HOME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        intent.setAction(I_AM_HOME);
        intent.putExtra("mealPosition", new Random().nextInt(5));
        sendBroadcast(intent);

    }

}