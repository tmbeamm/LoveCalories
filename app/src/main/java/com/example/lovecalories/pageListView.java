package com.example.lovecalories;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.lovecalories.adapter.itemListAdapter;
import com.example.lovecalories.db.DatabaseHelper;
import com.example.lovecalories.model.itemFood;

import java.util.ArrayList;

public class pageListView extends AppCompatActivity {

    private DatabaseHelper mHelper;
    private SQLiteDatabase mDb;

    private ArrayList<itemFood> mItemList = new ArrayList<>();
    private ArrayList<Integer>resultCal = new ArrayList<>();
    private ListView mItemListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_list_view);

        FloatingActionButton plusBtn = (FloatingActionButton)findViewById(R.id.floatingActionButton);
        mHelper = new DatabaseHelper(this);
        mDb = mHelper.getWritableDatabase();
        mItemListView = (ListView) findViewById(R.id.listView);

        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn2 = new Intent(pageListView.this,pageChoose.class);
                startActivity(itn2);
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();

        Cursor cursor = mDb.query(DatabaseHelper.TABLE_NAME, null, null, null, null, null, null);

        mItemList.clear();
        resultCal.clear();
        while (cursor.moveToNext()) {
            String food = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COL_FOOD));
            int cal = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COL_CAL));
            String date = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COL_DATE));

            itemFood item = new itemFood(food, cal, date);
            mItemList.add(item);
            resultCal.add(cal);
        }
        int rCal = 0;
        for(int i = 0;i<resultCal.size();i++){
            rCal+=resultCal.get(i);
        }

        TextView tv = (TextView)findViewById(R.id.showCalorie);
        tv.setText("Calories = "+Integer.toString(rCal));

        itemListAdapter adapter = new itemListAdapter(this,R.layout.list_item,mItemList);
        mItemListView.setAdapter(adapter);

    }
}
