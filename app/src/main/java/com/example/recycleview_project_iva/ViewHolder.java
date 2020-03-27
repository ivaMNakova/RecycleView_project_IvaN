package com.example.recycleview_project_iva;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;
    private TextView textView2;
    private TextView textView3;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.textView);
        textView2 = itemView.findViewById(R.id.textView2);
        textView3 = itemView.findViewById(R.id.textView3);
    }

    public TextView getTitle (){
        return textView;
    }
    public TextView getGenre() {
        return textView2;
    }
    public TextView getYear() {
        return textView3;
    }

    public void setTitle(String textView) {
        this.textView.setText(textView);
    }

    public void setGenre(String textView2) {
        this.textView2.setText(textView2);
    }

    public void setYear(String textView3) {
        this.textView3.setText(textView3);
    }
}

