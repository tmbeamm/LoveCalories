package com.example.lovecalories.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.lovecalories.R;
import com.example.lovecalories.model.itemFood;

import java.util.ArrayList;

/**
 * Created by tmbeamm on 12/14/2016 AD.
 */

public class itemListAdapter extends ArrayAdapter<itemFood> {

    private Context mContext;
    private int mLayoutResId;
    private ArrayList<itemFood> mitemList;

    public itemListAdapter(Context context, int resource, ArrayList<itemFood> itemList) {
        super(context, resource,itemList);

        this.mContext = context;
        this.mLayoutResId = resource;
        this.mitemList = itemList;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View itemLayout = convertView;
        if(itemLayout == null){
            itemLayout = View.inflate(mContext, mLayoutResId, null);
        }

        TextView foodTextView = (TextView)itemLayout.findViewById(R.id.list_item_View1);
        TextView calTextView = (TextView)itemLayout.findViewById(R.id.list_item_View2);

        itemFood item = mitemList.get(position);

        foodTextView.setText(item.getFood());
        calTextView.setText("Calories = "+Integer.toString(item.getCal())+" , "+item.getDate());

        return itemLayout;
    }
}
