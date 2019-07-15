package com.phong.baitaprenluyen1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtCMND, edtPhone, edtDiaChi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
    }

    private void addControls() {
        edtCMND=(EditText) findViewById(R.id.edtCMND);
        edtPhone=(EditText) findViewById(R.id.edtPhone);
        edtDiaChi=(EditText) findViewById(R.id.edtDiaChi);
    }

    public void XuLyCapNhat(View view) {
        //Dùng cửa sổ
        Toast.makeText(this,"Bạn nhấn cập nhật",Toast.LENGTH_LONG).show();
    }

    public void XuLyLamLai(View view) {
        //Xoá những dữ liệu rỗng
        edtCMND.setText("");
        edtPhone.setText("");
        edtDiaChi.setText("");
        //Di chuyển con trỏ văn bản tới CMND, Phone, DiaChi
        edtCMND.requestFocus();
    }
}
