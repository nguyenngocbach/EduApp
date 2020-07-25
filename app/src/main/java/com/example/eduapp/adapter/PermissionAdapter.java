package com.example.eduapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eduapp.Model.Permission;
import com.example.eduapp.Model.PermissionListener;
import com.example.eduapp.R;

import java.util.List;

public class PermissionAdapter extends RecyclerView.Adapter<PermissionAdapter.ViewHolder> {

    private Context mContext;
    private List<Permission> mPermissions;
    private PermissionListener listener;

    public PermissionAdapter(Context mContext, List<Permission> mPermissions, PermissionListener listener) {
        this.mContext = mContext;
        this.mPermissions = mPermissions;
        this.listener = listener;
    }

    @NonNull
    @Override
    public PermissionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mContext).inflate(R.layout.line_permission,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PermissionAdapter.ViewHolder holder, final int position) {
        holder.oBind(mPermissions.get(position));
        holder.txtPermission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.getPermission(mPermissions.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {
        return mPermissions.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtPermission;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtPermission= itemView.findViewById(R.id.txt_permission);
        }

        public void oBind(Permission permission) {
            txtPermission.setText(permission.getNamePermission());
        }
    }
}
