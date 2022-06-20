package com.mortuza.recyclerview.viewHolder;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mortuza.recyclerview.listeners.CallBackListener;

public class ViewHolder4 extends RecyclerView.ViewHolder implements View.OnClickListener {
    CallBackListener.RecyclerCallBack listener;

    public ViewHolder4(@NonNull View itemView, CallBackListener.RecyclerCallBack listener) {
        super(itemView);
        this.listener = listener;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
         
        }
    }
}
