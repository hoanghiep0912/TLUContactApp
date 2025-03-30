package com.example.tlucontactapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import android.widget.Button;

public class StaffAdapter extends RecyclerView.Adapter<StaffAdapter.StaffViewHolder> {
    private Context context;
    private List<Staff> staffList;

    private static Button btn_quaylai;

    public StaffAdapter(Context context, List<Staff> staffList) {
        this.context = context;
        this.staffList = staffList;
    }

    @NonNull
    @Override
    public StaffViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_staff, parent, false);
        return new StaffViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StaffViewHolder holder, int position) {
        Staff staff = staffList.get(position);
        holder.txtStaffName.setText(staff.getName());
        holder.txtStaffPosition.setText(staff.getPosition());
        holder.txtStaffUnit.setText(staff.getUnit());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, StaffDetailActivity.class);
                intent.putExtra("name", staff.getName());
                intent.putExtra("position", staff.getPosition());
                intent.putExtra("phone", staff.getPhone());
                intent.putExtra("email", staff.getEmail());
                intent.putExtra("unit", staff.getUnit());
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return staffList.size();
    }

    public static class StaffViewHolder extends RecyclerView.ViewHolder {
        private Button btn_quaylai;

        TextView txtStaffName, txtStaffPosition, txtStaffUnit;

        public StaffViewHolder(View itemView) {
            super(itemView);
            txtStaffName = itemView.findViewById(R.id.txtStaffName);
            txtStaffPosition = itemView.findViewById(R.id.txtStaffPosition);
            txtStaffUnit = itemView.findViewById(R.id.txtStaffUnit);


            };
        }

    }

