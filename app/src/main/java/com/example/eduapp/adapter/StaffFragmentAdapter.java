package com.example.eduapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eduapp.Model.Staff;
import com.example.eduapp.R;

import java.util.List;

public class StaffFragmentAdapter extends RecyclerView.Adapter<StaffFragmentAdapter.ViewHolder> {

    private Context mContext;
    private List<Staff> mStaff;

    public StaffFragmentAdapter(Context mContext, List<Staff> mStaff) {
        this.mContext = mContext;
        this.mStaff = mStaff;
    }

    @NonNull
    @Override
    public StaffFragmentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.line_staff_fragment_adapter,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StaffFragmentAdapter.ViewHolder holder, int position) {
        Staff staff= mStaff.get(position);
        // setImage
        holder.txtNameStaff.setText(staff.getName());
    }

    @Override
    public int getItemCount() {
        return mStaff.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgStaff;
        TextView txtNameStaff;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgStaff= itemView.findViewById(R.id.imageView2);
            txtNameStaff= itemView.findViewById(R.id.txt_nameStaff);
        }
    }
}
