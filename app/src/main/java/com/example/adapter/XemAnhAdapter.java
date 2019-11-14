package com.example.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.testkiemtra.R;

import java.util.List;

public class XemAnhAdapter extends ArrayAdapter<Integer> {
    Activity context;
    int resource;
    List<Integer> objects;

    public XemAnhAdapter(@NonNull Activity context, int resource, @NonNull List<Integer> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = this.context.getLayoutInflater();
        View row = layoutInflater.inflate(this.resource, null);
        ImageView img = row.findViewById(R.id.imgHinh);
        img.setImageResource(this.objects.get(position));
        return row;
    }
}
