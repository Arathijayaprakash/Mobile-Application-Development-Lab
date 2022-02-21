package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ImGVAdapter extends ArrayAdapter<ImageModel> {

    public ImGVAdapter(@NonNull Context context, ArrayList<ImageModel> imageModelArrayList) {
        super(context, 0,imageModelArrayList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        View listitemView=convertView;
        if (listitemView==null){
            listitemView= LayoutInflater.from(getContext()).inflate(R.layout.card_item,parent,false);
        }
        ImageModel imageModel=getItem(position);
        TextView imTV=listitemView.findViewById(R.id.tvtext);
        ImageView imIV=listitemView.findViewById(R.id.ivimage);
        imTV.setText(imageModel.getImg_name());
        imIV.setImageResource(imageModel.getImgid());
        return listitemView;
    }
}
