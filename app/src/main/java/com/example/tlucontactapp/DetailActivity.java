package com.example.tlucontactapp;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    private TextView txtDetailName, txtDetailPhone, txtDetailAddress;
    private Button btnBack;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtDetailName = findViewById(R.id.txtDetailName);
        txtDetailPhone = findViewById(R.id.txtDetailPhone);
        txtDetailAddress = findViewById(R.id.txtDetailAddress);
        btnBack = findViewById(R.id.btnBack);

        txtDetailName.setText(getIntent().getStringExtra("name"));
        txtDetailPhone.setText(getIntent().getStringExtra("phone"));
        txtDetailAddress.setText(getIntent().getStringExtra("address"));

        btnBack.setOnClickListener(v -> finish());
    }
}
