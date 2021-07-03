package com.example.transitionanimation.RefreshActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ListView;

import com.example.transitionanimation.R;

import java.util.ArrayList;
import java.util.List;

public class SwipeRefreshActivity extends AppCompatActivity {


    private SwipeRefreshLayout mswipeRefreshLayout;
    private ListView listView;


    List<Model> modelList;
    MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_refresh);


        mswipeRefreshLayout=findViewById(R.id.swiperefresh_items);
        listView=findViewById(R.id.listview_id);


        mswipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {


                final Handler handler=new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mswipeRefreshLayout.isRefreshing()){
                            mswipeRefreshLayout.setRefreshing(false);
                        }
                    }
                },4000);

             /*   final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(mySwipeRefreshLayout.isRefreshing()) {
                            mySwipeRefreshLayout.setRefreshing(false);
                        }
                    }
                }, 1000);

              */

            }
        });

        swipColor();

        getName();

        myAdapter=new MyAdapter(this,modelList);
        listView.setAdapter(myAdapter);





    }

    private void getName() {

        modelList=new ArrayList<>();

        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));
        modelList.add(new Model("MD Doyal Babu"));

    }

    private void swipColor() {


        mswipeRefreshLayout.setColorSchemeColors(
                getResources().getColor(android.R.color.holo_blue_bright),
                getResources().getColor(android.R.color.holo_green_light),
                getResources().getColor(android.R.color.holo_orange_light),
                getResources().getColor(android.R.color.holo_red_light)

        );


    }
}