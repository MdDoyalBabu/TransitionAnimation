package com.example.transitionanimation.RefreshActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.transitionanimation.R;

import java.util.List;

public class MyAdapter extends BaseAdapter {


    Context context;
    List<Model> list;

    public MyAdapter(Context context, List<Model> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view= LayoutInflater.from(context).inflate(R.layout.list_view_layout,parent,false);

        TextView textView=view.findViewById(R.id.textview);

        textView.setText(list.get(position).getName());

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Position"+position, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
