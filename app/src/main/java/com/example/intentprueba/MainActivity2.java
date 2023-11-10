package com.example.intentprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle sacRebut = getIntent().getExtras();

        string nom = sacRebut.getString("NomLogin");

        TextView textView = findViewById(R.id.nomRebut);
        TextView.setText("Hola " + nom);
    }
}