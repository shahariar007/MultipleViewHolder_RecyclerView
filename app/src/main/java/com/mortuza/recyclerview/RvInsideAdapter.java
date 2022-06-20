package com.mortuza.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mortuza.recyclerview.listeners.CallBackListener;
import com.mortuza.recyclerview.viewHolder.ViewHolder7;

import java.util.List;

public class RvInsideAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    List<Object> object;
    CallBackListener.RecyclerCallBack listener;

    public RvInsideAdapter(Context context, List<Object> object, CallBackListener.RecyclerCallBack listener) {
        this.context = context;
        this.object = object;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder7(LayoutInflater.from(context).inflate(R.layout.view_holder_7, parent, false), listener);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return (object != null && object.size() > 0) ? object.size() : 0;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }
}
