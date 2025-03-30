package com.example.tlucontactapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class StaffActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private StaffAdapter adapter;
    private List<Staff> staffList;
    private Button btnQuayLai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);

        // Khởi tạo và thiết lập nút quay lại
        btnQuayLai = findViewById(R.id.btn_quaylai);
        btnQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Đóng activity hiện tại và quay lại activity trước đó
            }
        });

        recyclerView = findViewById(R.id.recyclerViewStaff);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        staffList = new ArrayList<>();
        // Thêm dữ liệu mẫu
        staffList.add(new Staff("Nguyễn Văn A", "Trưởng phòng", "0912345678", "nguyenvana@tlu.edu.vn", "Phòng Đào tạo"));
        staffList.add(new Staff("Trần Thị B", "Phó trưởng phòng", "0923456789", "tranthib@tlu.edu.vn", "Phòng Công tác Sinh viên"));
        staffList.add(new Staff("Lê Văn C", "Giảng viên", "0934567890", "levanc@tlu.edu.vn", "Khoa Công nghệ Thông tin"));
        staffList.add(new Staff("Phạm Thị D", "Kế toán", "0945678901", "phamthid@tlu.edu.vn", "Phòng Tài chính Kế toán"));
        staffList.add(new Staff("Hoàng Văn E", "Trưởng khoa", "0956789012", "hoangvane@tlu.edu.vn", "Khoa Công nghệ Thông tin"));

        adapter = new StaffAdapter(this, staffList);
        recyclerView.setAdapter(adapter);
    }
}
