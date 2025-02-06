package com.example.lab4;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edittext);
        textView = findViewById(R.id.texttotime);
        String time = getIntent().getStringExtra("TIME");
        if (time != null && !time.isEmpty()) {
            textView.setText(time);
        }

    }
    public void onclick(View view){
        String name = editText.getText().toString();
        if (!name.isEmpty()){
            Intent intent = new Intent(this,SecondActivity.class);
            intent.putExtra("NAME",name);
            startActivity(intent);
        }
        else{
            Toast.makeText(getApplicationContext(),"Вы ничего не ввели", Toast.LENGTH_SHORT).show();
        }
    }

}