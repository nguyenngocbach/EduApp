package com.example.eduapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eduapp.Model.Staff;
import com.example.eduapp.Model.StaffListenner;
import com.example.eduapp.R;

import java.util.List;

public class StaffAdapter extends RecyclerView.Adapter<StaffAdapter.ViewHolder> {
    private Context mContext;
    private List<Staff> mStaff;
    private StaffListenner listenner;

    public StaffAdapter(Context mContext, List<Staff> mStaff, StaffListenner listenner) {
        this.mContext = mContext;
        this.mStaff = mStaff;
        this.listenner = listenner;
    }

    @NonNull
    @Override
    public StaffAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.line_staff,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StaffAdapter.ViewHolder holder, int position) {
        final Staff staff = mStaff.get(position);
        holder.onBind(staff);
        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listenner.getStaff(staff);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mStaff.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;
        ImageView imgStaff, imgIcon;
        ConstraintLayout constraintLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName= itemView.findViewById(R.id.txt_nameStaff);
            imgIcon= itemView.findViewById(R.id.icon_staff);
            imgStaff= itemView.findViewById(R.id.img_staff);
            constraintLayout= itemView.findViewById(R.id.click_event);
        }

        public void onBind(Staff staff) {
            txtName.setText(staff.getName());
            if (staff.isCheck()){
                imgIcon.setVisibility(View.VISIBLE);
            }
            // setImage///
        }
    }
}
