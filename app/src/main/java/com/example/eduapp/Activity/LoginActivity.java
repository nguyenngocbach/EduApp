package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.eduapp.R;

public class LoginActivity extends AppCompatActivity {
    Button btnLogin, btn_Login_Accept;
    Dialog dlFailedLogin;
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

    }




    private void Anhxa() {
        btnLogin = (Button) findViewById(R.id.btn_Login);
        dlFailedLogin = new Dialog(LoginActivity.this);
        dlFailedLogin.setContentView(R.layout.custom_dialog);
        dlFailedLogin.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        btn_Login_Accept = (Button) dlFailedLogin.findViewById(R.id.btn_Login_Accept);
        btn_Login_Accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dlFailedLogin.cancel();
            }
        });
    }
}