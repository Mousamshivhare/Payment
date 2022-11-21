package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG ="com.example.myapplication.ORDER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void makepayment (View view){
        Intent intent = new Intent (this, MainActivity2.class);
        EditText textView = findViewById(R.id.textView);
        String message = textView.getText().toString() + "payment done";
        intent.putExtra(MSG,message);
        startActivity(intent);
    }
}
