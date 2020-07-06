package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.eduapp.R;

public class LoginActivity extends AppCompatActivity {
    Button btnLogin, btn_Dialog_Accept;
    Dialog dlFailedLogin;
    TextView tvForgotPassword;
    TextView tvContentLog1, tvContentLog2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Anhxa();
        Listener();

    }

    private void Listener() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dlFailedLogin.show();
            }
        });
        tvForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
                startActivity(intent);
            }
        });
        tvContentLog1.setVisibility(View.INVISIBLE);
        btn_Dialog_Accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dlFailedLogin.cancel();
            }
        });
    }




    private void Anhxa() {
        btnLogin = (Button) findViewById(R.id.btn_Login);
        dlFailedLogin = new Dialog(LoginActivity.this);
        dlFailedLogin.setContentView(R.layout.custom_dialog);
        dlFailedLogin.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        btn_Dialog_Accept = (Button) dlFailedLogin.findViewById(R.id.btn_Dialog_Accept);
        tvForgotPassword = (TextView) findViewById(R.id.tvForgotPassword);
        tvContentLog1 = dlFailedLogin.findViewById(R.id.tv_content_log1);
        tvContentLog2 = dlFailedLogin.findViewById(R.id.tv_content_log2);
    }
}