package com.example.testkiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox chkGiaiPTBacJai;
    CheckBox chkKTSoHoanHao;
    CheckBox chkNoiVaDaoNguocXau;
    CheckBox chkGuiTNVaHinhAnh;
    CheckBox chkUngDungXemAnh;
    CheckBox chkThucHienCuocGoi;
    Button btnOk;
    Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addControls() {
        chkGiaiPTBacJai = findViewById(R.id.chkGiaiPTBacJai);
        chkKTSoHoanHao = findViewById(R.id.chkKTSoHoanHao);
        chkNoiVaDaoNguocXau = findViewById(R.id.chkNoiVaDaoNguocXau);
        chkGuiTNVaHinhAnh = findViewById(R.id.chkGuiTNVaHinhAnh);
        chkUngDungXemAnh = findViewById(R.id.chkUngDungXemAnh);
        chkThucHienCuocGoi = findViewById(R.id.chkThucHienCuocGoi);
        btnOk = findViewById(R.id.btnOk);
        btnExit = findViewById(R.id.btnExit);
    }

    private void addEvents() {
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processOk();
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processExit();
            }
        });
    }

    private void processOk() {
        if(!chkKTSoHoanHao.isChecked() && !chkUngDungXemAnh.isChecked())
        {
            Toast.makeText(this, "Vui lòng chọn Kiểm tra số hoàn hảo và Ứng dụng xem ảnh!", Toast.LENGTH_LONG).show();
        }
        else
        {
            Intent  list = new Intent(this, ListActivity.class);
            startActivity(list);
        }
    }

    private void processExit() {
        System.exit(0);
    }
}
