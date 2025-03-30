package com.example.tlucontactapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class UnitDetailActivity extends AppCompatActivity {
    private TextView txtUnitName, txtUnitPhone, txtDetailAddress;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_detail);

        txtUnitName = findViewById(R.id.txtUnitName);
        txtUnitPhone = findViewById(R.id.txtUnitPhone);
        txtDetailAddress = findViewById(R.id.txtDetailAddress);
        btnBack = findViewById(R.id.btnBack);

        // Lấy dữ liệu từ Intent
        String name = getIntent().getStringExtra("name");
        String phone = getIntent().getStringExtra("phone");
        String address = getIntent().getStringExtra("address");

        // Hiển thị dữ liệu
        txtUnitName.setText(name);
        txtUnitPhone.setText(phone);
        txtDetailAddress.setText(address);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
