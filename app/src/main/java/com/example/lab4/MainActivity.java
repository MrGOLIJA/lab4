package com.example.lab4;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.time.LocalDate;
import java.time.LocalTime;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    LocalTime localTime;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText.findViewById(R.id.edittext);
        textView.findViewById(R.id.texttotime);
    }
    public void onclick(View view){
        String name = editText.getText().toString();
        if (!name.isEmpty()){
            Intent intent = new Intent(this,SecondActivity.class);
            intent.putExtra("EXTRA_TEXT",name);
            startActivity(intent);
        }
    }

}