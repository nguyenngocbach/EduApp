package com.example.eduapp.Class;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eduapp.Model.ChildListener;
import com.example.eduapp.Model.Children;
import com.example.eduapp.Model.HealthListenner;
import com.example.eduapp.R;

import java.util.List;

public class HealthChildrensAdapter extends RecyclerView.Adapter<HealthChildrensAdapter.ViewHolder> {

    private Context mContext;
    private List<Children> mChildren;
    private HealthListenner listener;

    public HealthChildrensAdapter(Context mContext, List<Children> mChildren, HealthListenner listener) {
        this.mContext = mContext;
        this.mChildren = mChildren;
        this.listener = listener;
    }

    @NonNull
    @Override
    public HealthChildrensAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.line_health_childrens,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HealthChildrensAdapter.ViewHolder holder, final int position) {
        holder.onBind(mChildren.get(position));
        holder.imgEye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.reviewHealthChildren(mChildren.get(position));
            }
        });
        holder.imgUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.updateHealthChildren(mChildren.get(position));
            }
        });
        holder.imgDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.deleteChildren(mChildren.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mChildren.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtBirthday, txtSex, txtDateStart, txtTime;
        ImageView imgEye, imgUpdate, imgDelete;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName= itemView.findViewById(R.id.txt_name);
            txtBirthday= itemView.findViewById(R.id.txt_birthday);
            txtSex= itemView.findViewById(R.id.txtSex);
            txtDateStart= itemView.findViewById(R.id.txt_dayStart);
            txtTime= itemView.findViewById(R.id.txtTime);

            imgEye= itemView.findViewById(R.id.img_eye);
            imgUpdate= itemView.findViewById(R.id.img_update);
            imgDelete= itemView.findViewById(R.id.img_xxxx);
        }

        public void onBind(Children children) {
            txtName.setText(children.getName());
            txtBirthday.setText("10/10/2020");
            txtSex.setText("nam");
            txtDateStart.setText("11/10/2020");
            txtTime.setText("1000");
            /////

        }
    }
}
