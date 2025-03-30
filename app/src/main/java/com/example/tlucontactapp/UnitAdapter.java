package com.example.tlucontactapp;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.NonNull;
import java.util.List;

public class UnitAdapter extends RecyclerView.Adapter<UnitAdapter.UnitViewHolder> {
    private Context context;
    private List<Unit> units;

    public UnitAdapter(Context context, List<Unit> units) {
        this.context = context;
        this.units = units;
    }

    @NonNull
    @Override
    public UnitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_unit, parent, false);
        return new UnitViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UnitViewHolder holder, int position) {
        Unit unit = units.get(position);
        holder.txtUnitName.setText(unit.getName());
        holder.txtUnitPhone.setText(unit.getPhone());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, UnitDetailActivity.class);
                intent.putExtra("name", unit.getName());
                intent.putExtra("phone", unit.getPhone());
                intent.putExtra("address", unit.getAddress());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return units.size();
    }

    public static class UnitViewHolder extends RecyclerView.ViewHolder {
        TextView txtUnitName, txtUnitPhone;

        public UnitViewHolder(View itemView) {
            super(itemView);
            txtUnitName = itemView.findViewById(R.id.txtUnitName);
            txtUnitPhone = itemView.findViewById(R.id.txtUnitPhone);
        }
    }
}
