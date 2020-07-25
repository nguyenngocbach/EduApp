package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.eduapp.R;
import com.example.eduapp.fragments.ProgramsFragment;
import com.example.eduapp.fragments.RangeDateFragment;
import com.example.eduapp.fragments.StaffFragment;

import java.util.List;

public class SearchingActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView txtToolbar;
    private Button btnToolbar;
    private FrameLayout fragment;
    private Button btnProgramFragment, btnActiveFragment,btnRangeDate, btnStaff,btnSearch;
    private FragmentManager fm= getSupportFragmentManager();
    private int index=0;
    private  List<ProgramsFragment.Data> date;
    private  List<ProgramsFragment.Data> dateDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searching);
        inti();
        listener();
    }

    private void listener() {
        btnToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnProgramFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnProgramFragment.setBackgroundResource(R.color.colorblue);
                btnRangeDate.setBackgroundResource(R.color.colergrey);
                btnActiveFragment.setBackgroundResource(R.color.colergrey);
                btnStaff.setBackgroundResource(R.color.colergrey);
                //
                if (index==0) return;
                FragmentTransaction ft= fm.beginTransaction();
                ProgramsFragment fragment= new ProgramsFragment();
                ft.replace(R.id.frame_layoyt,fragment);
                fragment.setData(date);
                ft.commit();
                index=0;
            }
        });
        btnActiveFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnProgramFragment.setBackgroundResource(R.color.colergrey);
                btnRangeDate.setBackgroundResource(R.color.colergrey);
                btnActiveFragment.setBackgroundResource(R.color.colorblue);
                btnStaff.setBackgroundResource(R.color.colergrey);
                //
                btnProgramFragment.setBackgroundResource(R.color.colorblue);
                btnRangeDate.setBackgroundResource(R.color.colergrey);
                btnActiveFragment.setBackgroundResource(R.color.colergrey);
                btnStaff.setBackgroundResource(R.color.colergrey);
                //
                //if (index==1) date=dateDate;
                if (index==0|| index==1) return;
                FragmentTransaction ft= fm.beginTransaction();
                ProgramsFragment fragment= new ProgramsFragment();
                ft.replace(R.id.frame_layoyt,fragment);
                fragment.setData(dateDate);
                ft.commit();
                index=0;
            }
        });
        btnRangeDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnProgramFragment.setBackgroundResource(R.color.colergrey);
                btnRangeDate.setBackgroundResource(R.color.colorblue);
                btnActiveFragment.setBackgroundResource(R.color.colergrey);
                btnStaff.setBackgroundResource(R.color.colergrey);
                //
                if (index==2) return;
                FragmentTransaction ft= fm.beginTransaction();
                RangeDateFragment fragment= new RangeDateFragment();
                ft.replace(R.id.frame_layoyt,fragment);
                ft.commit();
                index=2;
            }
        });
        btnStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnProgramFragment.setBackgroundResource(R.color.colergrey);
                btnRangeDate.setBackgroundResource(R.color.colergrey);
                btnActiveFragment.setBackgroundResource(R.color.colergrey);
                btnStaff.setBackgroundResource(R.color.colorblue);
                //
                if (index==3) return;
                FragmentTransaction ft= fm.beginTransaction();
                StaffFragment fragment= new StaffFragment();
                ft.replace(R.id.frame_layoyt,fragment);
                ft.commit();
                index=3;
            }
        });
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo something
            }
        });
    }

    private void inti() {
        toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        txtToolbar.setText("Tìm Kiếm");
        btnToolbar= findViewById(R.id.btn_Toolbar);
        fragment= findViewById(R.id.frame_layoyt);
        btnProgramFragment= findViewById(R.id.btnProgram);
        btnActiveFragment= findViewById(R.id.btnActive);
        btnRangeDate= findViewById(R.id.btnRagenDate);
        btnStaff= findViewById(R.id.btnStaff);
        btnSearch= findViewById(R.id.button2);

        //
        FragmentTransaction ft= fm.beginTransaction();
        ft.add(R.id.frame_layoyt,new ProgramsFragment());
        ft.commit();
    }
}