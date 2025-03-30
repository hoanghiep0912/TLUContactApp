package com.example.tlucontactapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class UnitsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private UnitAdapter adapter;
    private List<Unit> unitList;
    private Button btnQuayLai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_units);

        // Khởi tạo và thiết lập nút quay lại
        btnQuayLai = findViewById(R.id.btn_quaylai);
        btnQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Đóng activity hiện tại và quay lại activity trước đó
            }
        });

        recyclerView = findViewById(R.id.recyclerViewUnits);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        unitList = new ArrayList<>();
        // Thêm dữ liệu mẫu
        unitList.add(new Unit("Phòng Đào tạo", "024.3852.2028", "Phòng 126, Nhà A1"));
        unitList.add(new Unit("Phòng Công tác Sinh viên", "024.3852.2567", "Phòng 115, Nhà A1"));
        unitList.add(new Unit("Phòng Khoa học Công nghệ", "024.3852.4529", "Phòng 214, Nhà A1"));
        unitList.add(new Unit("Phòng Tài chính Kế toán", "024.3852.2069", "Phòng 108, Nhà A1"));
        unitList.add(new Unit("Khoa Công nghệ Thông tin", "024.3852.2067", "Tầng 4, Nhà A1"));

        adapter = new UnitAdapter(this, unitList);
        recyclerView.setAdapter(adapter);
    }
}
