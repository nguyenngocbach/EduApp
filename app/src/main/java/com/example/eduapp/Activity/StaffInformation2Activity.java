package com.example.eduapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eduapp.Class.PermissionAdapter;
import com.example.eduapp.Model.Permission;
import com.example.eduapp.Model.PermissionListener;
import com.example.eduapp.R;

import java.util.ArrayList;
import java.util.List;

public class StaffInformation2Activity extends AppCompatActivity implements PermissionListener {

    private Toolbar toolbar;
    private TextView txtTitle,txtProgram, txtListProgram, txtPermission, txtListPermisson;
    private Button btnBack;
    private ImageView imgStaff,btnUpdate;
    private EditText edtLastName, edtFirstName,edtBrithDay, edtSex,
            edtBloon,edtStart,edtCode, edtplace,edtAllergy,edtNote;

    private RecyclerView recyclerPermission;
    private List<Permission> mPermissions;
    private PermissionAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_information2);
        init();
        listener();

    }

    private void listener() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo something
                Intent intent= new Intent(StaffInformation2Activity.this,UpdateStaffActivity.class);
                Bundle bundle= new Bundle();
                //
                //
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }


    private void init() {
        toolbar= findViewById(R.id.toolbar_staff_inforamtion);
        setSupportActionBar(toolbar);
        txtTitle= findViewById(R.id.txtTiltle_Toobar);
        txtTitle.setText("Thông Tin Nhân Viên");
        btnBack= findViewById(R.id.btn_Toolbar);

        imgStaff= findViewById(R.id.img_staff);
        edtLastName = findViewById(R.id.edt_lastName);
        edtFirstName = findViewById(R.id.edt_fisrtName);
        edtBrithDay = findViewById(R.id.birthday);
        edtSex = findViewById(R.id.edt_sex);
        edtBloon = findViewById(R.id.edt_bloolGroup);
        edtStart = findViewById(R.id.edt_dateStart);
        edtCode = findViewById(R.id.edt_code);
        edtplace = findViewById(R.id.edt_place);
        edtAllergy= findViewById(R.id.editTextTextPersonName7);
        edtNote= findViewById(R.id.edt_note);

        txtProgram= findViewById(R.id.txt_program);
        txtListProgram= findViewById(R.id.txt_program);
        txtPermission= findViewById(R.id.permisson);
        //txtListPermisson= findViewById(R.id.txt_listPermission);
        // recycleView
        btnUpdate= findViewById(R.id.btn_update);

        recyclerPermission= findViewById(R.id.recycle_permission);
        addData();
        adapter= new PermissionAdapter(this,mPermissions,this);
        LinearLayoutManager manager= new LinearLayoutManager(this);
        manager.setOrientation(RecyclerView.VERTICAL);
        recyclerPermission.setLayoutManager(manager);
        recyclerPermission.setAdapter(adapter);


    }

    private void addData() {
        mPermissions= new ArrayList<>();
        mPermissions.add(new Permission(12,"Permission One"));
        mPermissions.add(new Permission(12,"Permission Two"));
        mPermissions.add(new Permission(13,"Permission Three"));
        mPermissions.add(new Permission(14,"Permission Four"));
        mPermissions.add(new Permission(15,"Permission Five"));
    }

    @Override
    public void getPermission(Permission permission) {
        // todo something
    }
}