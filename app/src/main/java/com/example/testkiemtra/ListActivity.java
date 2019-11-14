package com.example.testkiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class ListActivity extends AppCompatActivity {
    RadioButton rdKTSoHH;
    RadioButton rdXemAnh;
    Button btnOk;
    Button btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        addControls();
        addEvents();
    }

    private void addControls() {
        rdKTSoHH = findViewById(R.id.rdKTSoHH);
        rdXemAnh = findViewById(R.id.rdXemAnh);
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
        if(rdKTSoHH.isChecked())
        {
            Intent soHH = new Intent(this, KTSoHHActivity.class);
            startActivity(soHH);
        }
        else if(rdXemAnh.isChecked())
        {
            Intent xemAnh = new Intent(this, XemAnhActivity.class);
            startActivity(xemAnh);
        }
    }

    private void processExit() {
        finish();
    }
}
