package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eduapp.R;

public class TYpeActivityActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView txtToolbar;
    private Button btnToolbar,btnDone;
    private Button btnArt, btnShare, btnColor, btnConstruction, btnDance, btnCraft, btnMusic, btnDraw, btnPottery, btnSpell;

    private View.OnClickListener listener= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
           switch (view.getId()){
               // todo something
               case R.id.btn_air :
                   break;
               case R.id.btn_share:
                   break;
               case  R.id.btn_color :
                   break;
               case R.id.btn_contruction :
                   break;
               case R.id.btn_dance:
                   break;
               case R.id.btn_handmade:
                   break;
               case R.id.btn_music:
                   break;
               case R.id.btnDraw:
                   break;
               case R.id.btn_pottery:
                   break;
               case R.id.btn_spell:
                   break;
           }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_ype_activity);
        init();
        listenner();
    }

    private void listenner() {
        btnToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // todo something
                finish();
            }
        });
        //btnArt, btnShare, btnColor, btnConstruction, btnDance, btnCraft, btnMusic, btnDraw, btnPottery, btnSpell;
        btnArt.setOnClickListener(listener);
        btnShare.setOnClickListener(listener);
        btnColor.setOnClickListener(listener);
        btnConstruction.setOnClickListener(listener);
        btnDance.setOnClickListener(listener);
        btnCraft.setOnClickListener(listener);
        btnMusic.setOnClickListener(listener);
        btnDraw.setOnClickListener(listener);
        btnPottery.setOnClickListener(listener);
        btnSpell.setOnClickListener(listener);

    }

    private void init() {
        toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        txtToolbar.setText("Chọn Loại Hoạt Động");
        btnToolbar= findViewById(R.id.btn_Toolbar);
        btnDone= findViewById(R.id.btnDone);

        btnArt= findViewById(R.id.btn_air);
        btnShare= findViewById(R.id.btn_share);
        btnColor= findViewById(R.id.btn_color);
        btnConstruction= findViewById(R.id.btn_contruction);
        btnDance= findViewById(R.id.btn_dance);
        btnCraft= findViewById(R.id.btn_handmade);
        btnMusic= findViewById(R.id.btn_music);
        btnDraw= findViewById(R.id.btnDraw);
        btnPottery= findViewById(R.id.btn_pottery);
        btnSpell= findViewById(R.id.btn_spell);

    }
}