package com.example.dell.mvppattern.View.DangNhap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.dell.mvppattern.Presenter.DangNhap.PresenterLogic;
import com.example.dell.mvppattern.R;

public class MainActivity extends AppCompatActivity implements ViewXuLiDangNhap,View.OnClickListener{
    EditText user,pass;
    Button btnclick;
    PresenterLogic presenterLogic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        btnclick.setOnClickListener(this);
    }

    private void anhxa() {
        user=findViewById(R.id.edtName);
        pass=findViewById(R.id.edtPass);
        btnclick=findViewById(R.id.btnClick);
        presenterLogic=new PresenterLogic(this);
    }

    @Override
    public void onClick(View view) {
        String u=user.getText().toString();
        String p=pass.getText().toString();
        presenterLogic.KiemTraDangNhap(u,p);
    }

    @Override
    public void DangNhapThanhCong() {
        Toast.makeText(MainActivity.this,"Danng Nhap Thanh cong",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void DangNhapThatBai() {
        Toast.makeText(MainActivity.this,"Danng Nhap That bai",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void chuyenActivity() {
        Intent intent=new Intent(MainActivity.this,TrangChu.class);
        startActivity(intent);
    }
}
