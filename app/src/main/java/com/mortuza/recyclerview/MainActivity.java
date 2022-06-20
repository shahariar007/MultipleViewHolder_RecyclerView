package com.mortuza.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mortuza.recyclerview.listeners.CallBackListener;
import com.mortuza.recyclerview.model.HeaderModel;
import com.mortuza.recyclerview.model.ImageModel;
import com.mortuza.recyclerview.model.NewsModel;
import com.mortuza.recyclerview.model.RecycleModel;
import com.mortuza.recyclerview.model.SideImageModel;
import com.mortuza.recyclerview.model.TitleModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements CallBackListener.RecyclerCallBack {
    List<Object> lists = new ArrayList<>();
    RecyclerView rvHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        initList();
        rvHome = findViewById(R.id.rvHome);
        RvAdapter adapter = new RvAdapter(this, lists, this);
        rvHome.setLayoutManager(new LinearLayoutManager(this));
        rvHome.setAdapter(adapter);
    }

    void initList() {
        lists.add(new ImageModel());
        lists.add(new ImageModel());
        lists.add(new NewsModel());
        lists.add(new NewsModel());
        lists.add(new NewsModel());
        lists.add(new NewsModel());
        lists.add(new HeaderModel());
        lists.add(new SideImageModel());
        lists.add(new SideImageModel());
        lists.add(new SideImageModel());
        lists.add(new HeaderModel());
        lists.add(new SideImageModel());
        lists.add(new SideImageModel());
        lists.add(new SideImageModel());
// for recycler show
        List<Object> objectList = new ArrayList<>();
        objectList.add(new ImageModel());
        objectList.add(new RecycleModel());
        objectList.add(new RecycleModel());
        objectList.add(new RecycleModel());
        objectList.add(new RecycleModel());
        objectList.add(new RecycleModel());
        objectList.add(new RecycleModel());
        RecycleModel model = new RecycleModel();
        model.setObjectList(objectList);

        lists.add(new HeaderModel());
        lists.add(model);


        lists.add(new HeaderModel());
        lists.add(new TitleModel());
        lists.add(new TitleModel());
        lists.add(new TitleModel());
        lists.add(new TitleModel());
        lists.add(new TitleModel());
        lists.add(new HeaderModel());
        lists.add(new SideImageModel());
        lists.add(new SideImageModel());
        lists.add(new SideImageModel());
        lists.add(new HeaderModel());
        lists.add(new SideImageModel());
        lists.add(new SideImageModel());
        lists.add(new SideImageModel());
    }
}