package com.example.activity_main;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnMoveActivity=findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent moveIntent=new Intent(MainActivity.this, MoveActivity.class);
        startActivity(moveIntent);
    }
}