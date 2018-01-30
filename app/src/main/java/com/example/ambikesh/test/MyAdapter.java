package com.example.ambikesh.test;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by AMBIKESH on 30-Jan-18.
 */

public class MyAdapter extends BaseAdapter
{
    Context ct;
    ArrayList<Integer> al;
    MyAdapter(Context c)
    {
        ct = c;
        al = new ArrayList<>();
        addItem();
    }
    void addItem()
    {
        for(int i=0;i<15;i++)
        {
            al.add(R.drawable.im);
        }
    }
    @Override
    public int getCount()
    {
        return al.size();
    }
    @Override
    public Object getItem(int position)
    {
        return al.get(position);
    }
    @Override
    public long getItemId(int position)
    {
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
      Activity at = (Activity) ct;
      View v = at.getLayoutInflater().inflate(R.layout.my_layout,null);
      TextView a = v.findViewById(R.id.tv1);
      TextView b = v.findViewById(R.id.tv2);
      ImageView i = v.findViewById(R.id.iv);
      i.setImageResource((int)al.get(position));
      a.setText("Hello");
      b.setText("Vishnu Here..!");
      return v;
    }
}
