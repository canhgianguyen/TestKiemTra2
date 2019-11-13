package com.example.testkiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox chkGiaiPTBacJai;
    CheckBox chkKTSoHoanHao;
    CheckBox chkNoiVaDaoNguocXau;
    CheckBox chkGuiTNVaHinhAnh;
    CheckBox chkUngDunXemAnh;
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
        chkUngDunXemAnh = findViewById(R.id.chkThucHienCuocGoi);
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

    }

    private void processExit() {
        System.exit(0);
    }
}
