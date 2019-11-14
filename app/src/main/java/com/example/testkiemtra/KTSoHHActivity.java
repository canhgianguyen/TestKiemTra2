package com.example.testkiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class KTSoHHActivity extends AppCompatActivity {
    EditText txtSo;
    Button btnKiemTra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ktso_hh);
        addControls();
        addevents();
    }

    private void addControls() {
        txtSo = findViewById(R.id.txtSo);
        btnKiemTra = findViewById(R.id.btnKiemTra);
    }

    private void addevents() {
        btnKiemTra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processCheck();
            }
        });
    }

    private void processCheck() {
        int so = Integer.parseInt(txtSo.getText().toString());
        int tong = 0;
        for(int i = 1; i < so; i++)
        {
            if(so % i == 0)
            {
                tong += i;
            }
        }
        if(tong == so)
        {
            Toast.makeText(this, so + " là số hoàn hảo.", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, so + " không là số hoàn hảo.", Toast.LENGTH_LONG).show();
        }
    }
}
