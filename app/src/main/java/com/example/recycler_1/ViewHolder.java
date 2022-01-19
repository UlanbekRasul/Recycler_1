package com.example.recycler_1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private ImageView image;
    private TextView textView;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.image);
        textView = itemView.findViewById(R.id.textView);
    }

    public void onBind(Model model) {
        image.setImageResource(model.getPhoto());
        textView.setText(model.getText());
    }
}