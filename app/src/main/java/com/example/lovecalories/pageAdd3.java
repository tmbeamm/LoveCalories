package com.example.lovecalories;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.lovecalories.db.DatabaseHelper;

import java.util.ArrayList;
import java.util.Date;

public class pageAdd3 extends AppCompatActivity {

    private Spinner sp3;
    private Button okBtn3;

    private DatabaseHelper mHelper;
    private SQLiteDatabase mDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_add3);

        widget3();
        addList3();
        mHelper = new DatabaseHelper(this);
        mDB = mHelper.getWritableDatabase();

        okBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String food = String.valueOf(sp3.getSelectedItem());
                int cal = Integer.parseInt(calFood.calculate(food));
                Date date = new Date();
                String strDate = String.format("EatTime:%tF , %tT",date,date);


                ContentValues cv = new ContentValues();
                cv.put(DatabaseHelper.COL_FOOD, food);
                cv.put(DatabaseHelper.COL_CAL, cal);
                cv.put(DatabaseHelper.COL_DATE, strDate);

                mDB.insert(DatabaseHelper.TABLE_NAME,null,cv);
                finish();
            }
        });

    }
    private void widget3(){
        sp3 = (Spinner)findViewById(R.id.sp3);
        okBtn3 = (Button)findViewById(R.id.okBtn3);
    }

    private void addList3(){

        ArrayList<String> myList3 = new ArrayList<String>();
        myList3.add("กล้วยไข่");
        myList3.add("กล้วยน้ำว้า");
        myList3.add("กล้วยเล็บมือนาง");
        myList3.add("กล้วยหอม");
        myList3.add("กาแฟเย็น");
        myList3.add("กาแฟร้อน");
        myList3.add("แก้วมังกร");
        myList3.add("โกโก้");
        myList3.add("ขนุน");
        myList3.add("แคนตาลูป");
        myList3.add("เงาะ");
        myList3.add("ชมพู่");
        myList3.add("ช็อคโกแลต");
        myList3.add("ชาเขียว");
        myList3.add("ชาดำเย็น");
        myList3.add("ชามะนาว");
        myList3.add("ชาเย็น");
        myList3.add("ชาร้อน");
        myList3.add("เชอรี่");
        myList3.add("แตงโม");
        myList3.add("ทุเรียนชะนี");
        myList3.add("นมจืด");
        myList3.add("นมถั่วเหลือง");
        myList3.add("นมรสหวาน");
        myList3.add("นมเปรี้ยวรสผลไม้");
        myList3.add("นมเย็น");
        myList3.add("น้อยหน่า");
        myList3.add("น้ำกระเจี๊ยบ");
        myList3.add("น้ำขิง");
        myList3.add("น้ำจับเลี้ยง");
        myList3.add("น้ำใบเตย");
        myList3.add("น้ำใบบัวบก");
        myList3.add("น้ำผลไม้รวม");
        myList3.add("น้ำฝรั่ง");
        myList3.add("น้ำมะเขือเทศ");
        myList3.add("น้ำมะตูม");
        myList3.add("น้ำมะนาว");
        myList3.add("น้ำมะพร้าว");
        myList3.add("น้ำลำใย");
        myList3.add("น้ำส้มคั้น");
        myList3.add("น้ำสับปะรด");
        myList3.add("น้ำองุ่น");
        myList3.add("น้ำอัดลมหวาน");
        myList3.add("น้ำอัดลมโคล่า");
        myList3.add("น้ำแอปเปิ้ลแดง");
        myList3.add("เบียร์ไทย");
        myList3.add("ฝรั่ง");
        myList3.add("พุทรา");
        myList3.add("มะขามเทศ");
        myList3.add("มะม่วงเขียวเสวย");
        myList3.add("มะม่วงอกร่องสุก");
        myList3.add("มะละกอ");
        myList3.add("มังคุด");
        myList3.add("โยเกิร์ตธรรมชาติ");
        myList3.add("โยเกิร์ตรสผลไม้");
        myList3.add("ระกำ");
        myList3.add("ลองกอง");
        myList3.add("ละมุด");
        myList3.add("ลำไย");
        myList3.add("ลิ้นจี่");
        myList3.add("สตรอเบอร์รี่");
        myList3.add("ส้มเขียวหวาน");
        myList3.add("ส้มโอ");
        myList3.add("สละ");
        myList3.add("สับปะรด");
        myList3.add("สาลี่");
        myList3.add("องุ่น");
        myList3.add("แอปเปิ้ล");
        myList3.add("โอเลี้ยง");
        myList3.add("โอวัลติน");

        ArrayAdapter<String> foodAdapter3 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,myList3);
        foodAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp3.setAdapter(foodAdapter3);
    }

}
