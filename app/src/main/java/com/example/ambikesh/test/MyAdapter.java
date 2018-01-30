package com.example.ambikesh.test;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

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
      return null;
    }
}
