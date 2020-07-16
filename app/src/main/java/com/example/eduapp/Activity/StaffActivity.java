package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eduapp.Class.ChildrenAdapter;
import com.example.eduapp.Class.StaffAdapter;
import com.example.eduapp.Model.Staff;
import com.example.eduapp.Model.StaffListenner;
import com.example.eduapp.R;

import java.util.ArrayList;
import java.util.List;

public class StaffActivity extends AppCompatActivity implements StaffListenner {

    private Toolbar toolbar;
    private Button btnBack;
    private TextView txtToolbar;
    private RecyclerView recyclerView;
    private ImageView btnAddStaff;
    private List<Staff> mStaff;
    private StaffAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);
        init();

    }

    private void init() {
        toolbar= findViewById(R.id.toolbar_staff);
        setSupportActionBar(toolbar);
        btnBack= findViewById(R.id.btn_Toolbar);
        txtToolbar= findViewById(R.id.txtTiltle_Toobar);
        txtToolbar.setText("Nhân Viên");
        btnAddStaff= findViewById(R.id.btn_addStaff);
        recyclerView= findViewById(R.id.list_staff);
        addData();

        adapter= new StaffAdapter(this,mStaff,this);
        recyclerView.setAdapter(adapter);

        btnAddStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(StaffActivity.this,AddStaffActivity.class));
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

    private void addData() {
        mStaff= new ArrayList<>();
        mStaff.add(new Staff(123,"Mr.A", "s",false));
        mStaff.add(new Staff(123,"Mr.B", "s",false));
        mStaff.add(new Staff(123,"Mr.C", "s",true));
    }

    @Override
    public void getStaff(Staff staff) {
        if (staff.isCheck()==false){
            Intent intent= new Intent(StaffActivity.this,StaffInformationActivity.class);
            Bundle bundle= new Bundle();
            //
            intent.putExtras(bundle);
            startActivity(intent);
        }
        else {
            Intent intent= new Intent(StaffActivity.this,StaffInformation2Activity.class);
            Bundle bundle= new Bundle();
            //
            //
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
}