package com.example.tlucontactapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class StaffDetailActivity extends AppCompatActivity {
    private TextView txtStaffName, txtStaffPosition, txtStaffPhone, txtStaffEmail, txtStaffUnit;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_detail);

        txtStaffName = findViewById(R.id.txtStaffName);
        txtStaffPosition = findViewById(R.id.txtStaffPosition);
        txtStaffPhone = findViewById(R.id.txtStaffPhone);
        txtStaffEmail = findViewById(R.id.txtStaffEmail);
        txtStaffUnit = findViewById(R.id.txtStaffUnit);
        btnBack = findViewById(R.id.btnBack);

        // Lấy dữ liệu từ Intent
        String name = getIntent().getStringExtra("name");
        String position = getIntent().getStringExtra("position");
        String phone = getIntent().getStringExtra("phone");
        String email = getIntent().getStringExtra("email");
        String unit = getIntent().getStringExtra("unit");

        // Hiển thị dữ liệu
        txtStaffName.setText(name);
        txtStaffPosition.setText(position);
        txtStaffPhone.setText(phone);
        txtStaffEmail.setText(email);
        txtStaffUnit.setText(unit);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
