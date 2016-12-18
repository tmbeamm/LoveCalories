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

public class pageAdd2 extends AppCompatActivity {

    private Spinner sp2;
    private Button okBtn2;

    private DatabaseHelper mHelper;
    private SQLiteDatabase mDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_add2);

        widget2();
        addList2();
        mHelper = new DatabaseHelper(this);
        mDB = mHelper.getWritableDatabase();

        okBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String food = String.valueOf(sp2.getSelectedItem());
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
    private void widget2(){
        sp2 = (Spinner)findViewById(R.id.sp2);
        okBtn2 = (Button)findViewById(R.id.okBtn2);
    }
    private void addList2(){

        ArrayList<String> myList2 = new ArrayList<String>();
        myList2.add("กล้วยแขก");
        myList2.add("กล้วยไข่เชื่อม");
        myList2.add("กล้วยฉาบ");
        myList2.add("กล้วยน้ำว้าปิ้ง");
        myList2.add("กล้วยบวชชี");
        myList2.add("กะละแม");
        myList2.add("กะหรี่พัฟ");
        myList2.add("ขนมเข่ง");
        myList2.add("ขนมครก");
        myList2.add("ขนมจีบ");
        myList2.add("ขนมชั้น");
        myList2.add("ขนมต้มขาว");
        myList2.add("ขนมตาล");
        myList2.add("ขนมถ้วย");
        myList2.add("ขนมเทียน");
        myList2.add("ขนมบ้าบิ่น");
        myList2.add("ขนมเบื้อง");
        myList2.add("ขนมปังกระเทียม");
        myList2.add("ขนมปังสังขยา");
        myList2.add("ขนมปังไส้กรอก");
        myList2.add("ขนมปังไส้หมูหย็อง");
        myList2.add("ขนมเปียกปูน");
        myList2.add("ขนมหม้อแกง");
        myList2.add("ข้าวต้มมัด");
        myList2.add("ข้าวโพดคั่ว");
        myList2.add("ข้าวหลาม");
        myList2.add("ข้าวเหนียวสังขยา");
        myList2.add("ครองแครงกะทิ");
        myList2.add("คุ้กกี้ช็อคโกแลตชิพ");
        myList2.add("คุ้กกี้เนย");
        myList2.add("ซาหริ่ม");
        myList2.add("ทับทิมกรอบ");
        myList2.add("บัวลอย");
        myList2.add("โรตี");
        myList2.add("วุ้นกะทิ");
        myList2.add("ไอศกรีมช็อคโกแลต");
        myList2.add("ไอศกรีมวนิลลา");

        ArrayAdapter<String> foodAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,myList2);
        foodAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp2.setAdapter(foodAdapter2);
    }

}
