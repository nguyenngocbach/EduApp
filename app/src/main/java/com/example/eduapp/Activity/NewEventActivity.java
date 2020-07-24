package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.eduapp.R;

import org.w3c.dom.Text;

public class NewEventActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView txtToolbar;
    private Button btnToolbar,btnEvent, btnFestival, btnDone;
    private EditText edtCalender, edtTakkPlace, edtCProgram, edtReciever,edtDetialEnevt;
    private LinearLayout main,place;
    private int index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_event);
        init();
        listener();
    }

    private void listener() {
        btnToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(Activity.RESULT_CANCELED);
                finish();
            }
        });
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                //todo something
                //setResult(Activity.RESULT_OK,intent);
                finish();
            }
        });
        btnEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index==0) return;
                index=0;
                btnEvent.setBackgroundResource(R.drawable.custom_btn_indoor);
                btnFestival.setBackgroundResource(R.drawable.custom_btn_outdoor);
                animationEvent();
            }
        });

        btnFestival.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index==1) return;
                index=1;
                btnFestival.setBackgroundResource(R.drawable.custom_btn_indoor);
                btnEvent.setBackgroundResource(R.drawable.custom_btn_outdoor);
                animationFestival();
            }
        });
    }

    private void animationFestival() {
        AnimatorSet set= new AnimatorSet();
        ObjectAnimator animatoX= ObjectAnimator.ofFloat(main,"alpha",1.0f,0f);
        animatoX.setDuration(500);
        animatoX.setInterpolator(new AccelerateDecelerateInterpolator());

        ObjectAnimator animator= ObjectAnimator.ofFloat(main,"alpha",0f,1.0f);
        animator.setDuration(500);
        animator.setInterpolator(new AccelerateDecelerateInterpolator());

        animatoX.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                place.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
        set.play(animatoX).before(animator);
        set.start();
    }

    private void animationEvent() {
        AnimatorSet set= new AnimatorSet();
        ObjectAnimator animatoX= ObjectAnimator.ofFloat(main,"alpha",1.0f,0f);
        animatoX.setDuration(500);
        animatoX.setInterpolator(new AccelerateDecelerateInterpolator());

        ObjectAnimator animator= ObjectAnimator.ofFloat(main,"alpha",0f,1.0f);
        animator.setDuration(500);
        animator.setInterpolator(new AccelerateDecelerateInterpolator());

        animatoX.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                place.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
        set.play(animatoX).before(animator);
        set.start();
    }


    private void init() {
        toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        txtToolbar.setText("Sự Kiện Mới");
        btnToolbar=findViewById(R.id.btn_Toolbar);
        btnEvent=findViewById(R.id.btnEvent);
        btnFestival=findViewById(R.id.btnFestival);
        btnDone=findViewById(R.id.btn_done);


        edtCalender=findViewById(R.id.edtCalender);
        edtTakkPlace=findViewById(R.id.edtPlace);
        edtCProgram=findViewById(R.id.edtPersonal);
        edtReciever=findViewById(R.id.edtBell);
        edtDetialEnevt=findViewById(R.id.edtMenu);
        main= findViewById(R.id.layout_main);
        place= findViewById(R.id.layout_place);
    }
}