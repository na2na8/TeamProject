package com.example.kwon_younghoon.opensourceteam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kwon-younghoon on 2017. 11. 2..
 */

public class Adapter extends BaseAdapter {
    private ArrayList<CardData> cardArray = new ArrayList<CardData>();
    Context context;

    public Adapter(ArrayList<CardData> cardArray, Context context) {
        this.cardArray = cardArray;
        this.context = context;
    }

    @Override
    public int getCount() {
        return cardArray.size();
    }

    @Override
    public Object getItem(int i) {
        return cardArray.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(context);
        if(view==null) {
            view = inflater.inflate(R.layout.news, null);
        }
        ImageView i1 = (ImageView)view.findViewById(R.id.image);
        TextView t1 = (TextView)view.findViewById(R.id.text);
        CardData one;
        one = cardArray.get(i);
        i1.setImageResource(one.getImage());
        t1.setText(one.getText());
        return view;
    }
}
