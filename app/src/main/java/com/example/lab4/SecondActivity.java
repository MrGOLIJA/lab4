package com.example.lab4;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    LocalDateTime localTime;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.second_activity);
        textView = findViewById(R.id.textView);
        String currentText = getIntent().getStringExtra("EXTRA_TEXT");
        textView.setText("Добро пожаловать "+currentText);
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public void onclick(View view){
        Intent intent = new Intent(this, MainActivity.class);
        localTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String time = localTime.format(formatter);
        intent.putExtra("TIME",time);
        startActivity(intent);
    }
}
