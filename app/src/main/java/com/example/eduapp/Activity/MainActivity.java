package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.eduapp.R;

public class MainActivity extends AppCompatActivity {
    TextView tvForgotPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
    }

    private void Anhxa() {
        tvForgotPassword = (TextView) findViewById(R.id.tvForgotPassword);
    }
}