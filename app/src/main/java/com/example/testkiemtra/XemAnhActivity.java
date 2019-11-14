package com.example.testkiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.adapter.XemAnhAdapter;

import java.util.ArrayList;

public class XemAnhActivity extends AppCompatActivity {
    GridView gvHinh;
    ArrayList<Integer> dsHinh;
    XemAnhAdapter xemAnhAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xem_anh);
        addControls();
        addEvents();
    }

    private void addControls() {
        gvHinh = findViewById(R.id.gvHinh);

        dsHinh = new ArrayList<>();
        dsHinh.add(R.drawable.hinh1);
        dsHinh.add(R.drawable.hinh2);
        dsHinh.add(R.drawable.hinh3);
        dsHinh.add(R.drawable.hinh4);
        dsHinh.add(R.drawable.hinh5);
        dsHinh.add(R.drawable.hinh6);
        dsHinh.add(R.drawable.hinh7);
        dsHinh.add(R.drawable.hinh8);
        dsHinh.add(R.drawable.hinh9);
        dsHinh.add(R.drawable.hinh10);
        dsHinh.add(R.drawable.hinh11);
        dsHinh.add(R.drawable.hinh12);
        dsHinh.add(R.drawable.hinh13);
        dsHinh.add(R.drawable.hinh14);
        dsHinh.add(R.drawable.hinh15);
        dsHinh.add(R.drawable.hinh16);
        dsHinh.add(R.drawable.hinh17);
        dsHinh.add(R.drawable.hinh18);


        xemAnhAdapter = new XemAnhAdapter(this, R.layout.item, dsHinh);
        gvHinh.setAdapter(xemAnhAdapter);
    }

    private void addEvents() {

    }
}
