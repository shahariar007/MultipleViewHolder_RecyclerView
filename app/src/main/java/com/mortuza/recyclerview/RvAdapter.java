package com.mortuza.recyclerview;

import static com.mortuza.recyclerview.AppConstant.KEY_VIEWHOLDER1_IMAGEMODEL;
import static com.mortuza.recyclerview.AppConstant.KEY_VIEWHOLDER2_NEWSMODEL;
import static com.mortuza.recyclerview.AppConstant.KEY_VIEWHOLDER3_SIDEIMAGEMODEL;
import static com.mortuza.recyclerview.AppConstant.KEY_VIEWHOLDER4_HEADERMODEL;
import static com.mortuza.recyclerview.AppConstant.KEY_VIEWHOLDER5_TITLEMODEL;
import static com.mortuza.recyclerview.AppConstant.KEY_VIEWHOLDER6_RECYCLEMODEL;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mortuza.recyclerview.listeners.CallBackListener;
import com.mortuza.recyclerview.model.HeaderModel;
import com.mortuza.recyclerview.model.ImageModel;
import com.mortuza.recyclerview.model.NewsModel;
import com.mortuza.recyclerview.model.RecycleModel;
import com.mortuza.recyclerview.model.SideImageModel;
import com.mortuza.recyclerview.model.TitleModel;
import com.mortuza.recyclerview.viewHolder.ViewHolder1;
import com.mortuza.recyclerview.viewHolder.ViewHolder2;
import com.mortuza.recyclerview.viewHolder.ViewHolder3;
import com.mortuza.recyclerview.viewHolder.ViewHolder4;
import com.mortuza.recyclerview.viewHolder.ViewHolder5;
import com.mortuza.recyclerview.viewHolder.ViewHolder6;

import java.util.List;

public class RvAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements CallBackListener.RecyclerCallBack {
    Context context;
    List<Object> object;
    CallBackListener.RecyclerCallBack listener;

    public RvAdapter(Context context, List<Object> object, CallBackListener.RecyclerCallBack listener) {
        this.context = context;
        this.object = object;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case KEY_VIEWHOLDER4_HEADERMODEL: {
                return new ViewHolder4(LayoutInflater.from(context).inflate(R.layout.view_holder_4, parent, false), listener);
            }
            case KEY_VIEWHOLDER1_IMAGEMODEL: {
                return new ViewHolder1(LayoutInflater.from(context).inflate(R.layout.view_holder_1, parent, false), listener);
            }
            case KEY_VIEWHOLDER2_NEWSMODEL: {
                return new ViewHolder2(LayoutInflater.from(context).inflate(R.layout.view_holder_2, parent, false), listener);
            }
            case KEY_VIEWHOLDER6_RECYCLEMODEL: {
                return new ViewHolder6(LayoutInflater.from(context).inflate(R.layout.view_holder_6, parent, false), listener);
            }
            case KEY_VIEWHOLDER3_SIDEIMAGEMODEL: {
                return new ViewHolder3(LayoutInflater.from(context).inflate(R.layout.view_holder_3, parent, false), listener);
            }
            case KEY_VIEWHOLDER5_TITLEMODEL: {
                return new ViewHolder5(LayoutInflater.from(context).inflate(R.layout.view_holder_5, parent, false), listener);
            }
            default: {
                return new ViewHolder5(LayoutInflater.from(context).inflate(R.layout.view_holder_5, parent, false), listener);
            }
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ViewHolder1) {

        } else if (holder instanceof ViewHolder2) {

        } else if (holder instanceof ViewHolder3) {

        } else if (holder instanceof ViewHolder4) {

        } else if (holder instanceof ViewHolder5) {

        } else if (holder instanceof ViewHolder6) {
            ViewHolder6 h = (ViewHolder6) holder;
            RvInsideAdapter adapter = new RvInsideAdapter(context, ((RecycleModel) object.get(position)).getObjectList(), this);
            h.rv.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
            h.rv.setAdapter(adapter);
        }
    }

    @Override
    public int getItemCount() {
        return (object != null && object.size() > 0) ? object.size() : 0;
    }

    @Override
    public int getItemViewType(int position) {

        if (object.get(position) instanceof HeaderModel) {
            return KEY_VIEWHOLDER4_HEADERMODEL;
        } else if (object.get(position) instanceof ImageModel) {
            return KEY_VIEWHOLDER1_IMAGEMODEL;
        } else if (object.get(position) instanceof NewsModel) {
            return KEY_VIEWHOLDER2_NEWSMODEL;
        } else if (object.get(position) instanceof RecycleModel) {
            return KEY_VIEWHOLDER6_RECYCLEMODEL;
        } else if (object.get(position) instanceof SideImageModel) {
            return KEY_VIEWHOLDER3_SIDEIMAGEMODEL;
        } else if (object.get(position) instanceof TitleModel) {
            return KEY_VIEWHOLDER5_TITLEMODEL;
        }
        return super.getItemViewType(position);
    }
}
