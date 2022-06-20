package com.mortuza.recyclerview.viewHolder;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mortuza.recyclerview.R;
import com.mortuza.recyclerview.listeners.CallBackListener;

public class ViewHolder6 extends RecyclerView.ViewHolder implements View.OnClickListener {
    CallBackListener.RecyclerCallBack listener;
    public RecyclerView rv;

    public ViewHolder6(@NonNull View itemView, CallBackListener.RecyclerCallBack listener) {
        super(itemView);
        this.listener = listener;
        rv = itemView.findViewById(R.id.insideRecyclerView);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

        }
    }
}
