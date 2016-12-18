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

public class pageAdd1 extends AppCompatActivity {

    private Spinner sp1;
    private Button okBtn1;

    private DatabaseHelper mHelper;
    private SQLiteDatabase mDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_add1);

        widget1();
        addList1();
        mHelper = new DatabaseHelper(this);
        mDB = mHelper.getWritableDatabase();

        okBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String food = String.valueOf(sp1.getSelectedItem());
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
    private void widget1(){
        sp1 = (Spinner)findViewById(R.id.sp1);
        okBtn1 = (Button)findViewById(R.id.okBtn1);
    }
    private void addList1(){

        ArrayList<String> myList1 = new ArrayList<String>();
        myList1.add("ก๋วยจั๊บ");
        myList1.add("ก๋วยเตี๋ยวคั่วไก่");
        myList1.add("ก๋วยเตี๋ยวต้มยำกุ้ง");
        myList1.add("ก๋วยเตี๋ยวผัดไทยกุ้งสด");
        myList1.add("ก๋วยเตี๋ยวน้ำตก");
        myList1.add("ก๋วยเตี๋ยวเส้นเล็กต้มยำหมู");
        myList1.add("ก๋วยเตี๋ยวเส้นเล็กหมูแห้ง");
        myList1.add("ก๋วยเตี๋ยวเส้นใหญ่ผัดซีอิ๊ว");
        myList1.add("ก๋วยเตี๋ยวเส้นใหญ่ราดหน้าหมู");
        myList1.add("กุ้งอบวุ้นเส้น");
        myList1.add("เกาเหลาลูกชิ้นน้ำใส");
        myList1.add("แกงกะหรี่ไก่");
        myList1.add("แกงกะหรี่หมู");
        myList1.add("แกงเขียวหวานไก่");
        myList1.add("แกงเขียวหวานหมู");
        myList1.add("แกงจืดตำลึงหมูสับ");
        myList1.add("แกงจืดเต้าหู้หมูสับ");
        myList1.add("แกงจืดวุ้นเส้น");
        myList1.add("แกงมัสมั่นไก่");
        myList1.add("แกงส้มชะอมชุบไข่ทอดกับกุ้ง");
        myList1.add("แกงส้มปลาแปะซะ");
        myList1.add("แกงส้มผักรวม");
        myList1.add("แกงหมูเทโพ");
        myList1.add("ไก่ทอด");
        myList1.add("ไก่ผัดขิง");
        myList1.add("ไก่ย่าง");
        myList1.add("ขนมจีน");
        myList1.add("ขนมจีนน้ำพริก");
        myList1.add("ขนมจีนน้ำยา");
        myList1.add("ข้าวกุ้งทอดกระเทียมพริกไทย");
        myList1.add("ข้าวไก่อบ");
        myList1.add("ข้าวขาหมู");
        myList1.add("ข้าวไข่เจียว");
        myList1.add("ข้าวคลุกกะปิ");
        myList1.add("ข้าวต้ม");
        myList1.add("ข้าวผัดกะเพรากุ้ง");
        myList1.add("ข้าวผัดกะเพราไก่");
        myList1.add("ข้าวผัดกะเพราหมู");
        myList1.add("ข้าวผัดกุ้ง");
        myList1.add("ข้าวผัดกุนเชียง");
        myList1.add("ข้าวผัดคะน้าหมูกรอบ");
        myList1.add("ข้าวผัดต้มยำทะเล");
        myList1.add("ข้าวผัดน้ำพริกกุ้งสด");
        myList1.add("ข้าวผัดปู");
        myList1.add("ข้าวผัดหมูน้ำพริกเผา");
        myList1.add("ข้าวผัดหมู");
        myList1.add("ข้าวผัดแหนม");
        myList1.add("ข้าวผัดอเมริกัน");
        myList1.add("ข้าวมันไก่ทอด");
        myList1.add("ข้าวมันไก่ต้ม");
        myList1.add("ข้าวสวย");
        myList1.add("ข้าวหน้าเป็ด");
        myList1.add("ข้าวหมกไก่");
        myList1.add("ข้าวหมูกระเทียม");
        myList1.add("ข้าวหมูแดง");
        myList1.add("ข้าวเหนียวนึ่ง");
        myList1.add("ข้าวเหนียวหมูทอด");
        myList1.add("ข้าวเหนียวหมูสวรรค์");
        myList1.add("ไข่เจียวหมูสับ");
        myList1.add("ไข่ดาว");
        myList1.add("ไข่ตุ๋น");
        myList1.add("ไข่พะโล้");
        myList1.add("ไข่ยัดไส้");
        myList1.add("ไข่ลวก");
        myList1.add("คอหมูย่าง");
        myList1.add("คะน้าหมูกรอบ");
        myList1.add("ต้มข่าไก่");
        myList1.add("ต้มจับฉ่าย");
        myList1.add("ต้มยำกุ้ง");
        myList1.add("ต้มยำปลากระพง");
        myList1.add("ต้มเลือดหมู");
        myList1.add("ทอดมันกุ้ง");
        myList1.add("ทอดมันปลากราย");
        myList1.add("น้ำพริกหนุ่ม");
        myList1.add("น้ำพริกอ่อง");
        myList1.add("บะหมี่กรอบราดหน้า");
        myList1.add("บะหมี่กรอบราดหน้ารวมมิตร");
        myList1.add("บะหมี่เกี๊ยวเป็ดย่าง");
        myList1.add("บะหมี่เกี๊ยวน้ำหมูแดง");
        myList1.add("บะหมี่น้ำต้มยำหมู");
        myList1.add("บะหมี่เป็ด");
        myList1.add("บะหมี่แห้งหมูแดง");
        myList1.add("ปลากระพงนึ่งมะนาว");
        myList1.add("ปลาทอดสามรส");
        myList1.add("ปลาทูทอด");
        myList1.add("ปลาราดพริก");
        myList1.add("ผัดกะหล่ำปลีหมูกุ้ง");
        myList1.add("ผัดถั่วงอกเต้าหู้");
        myList1.add("ผัดบร็อกโคลี่กุ้ง");
        myList1.add("ผัดผักบุ้งไฟแดง");
        myList1.add("ผัดผักรวมหมู");
        myList1.add("ผัดฟักทองใส่ไข่");
        myList1.add("ผัดวุ้นเส้นใส่ไข่");
        myList1.add("ยำกุนเชียง");
        myList1.add("ยำรวมมิตรทะเล");
        myList1.add("ยำวุ้นเส้น");
        myList1.add("ยำหมูย่าง");
        myList1.add("เย็นตาโฟ");
        myList1.add("ลาบไก่");
        myList1.add("ลาบหมู");
        myList1.add("สเต็กไก่");
        myList1.add("สเต็กหมู");
        myList1.add("ส้มตำไทย");
        myList1.add("ส้มตำปู");
        myList1.add("สลัดผัก");
        myList1.add("สุกี้น้ำหมู-ไก่");
        myList1.add("สุกี้แห้งทะเล");
        myList1.add("เส้นหมี่ลูกชิ้นน้ำใส");
        myList1.add("เส้นหมี่ลูกชิ้นหมูแห้ง");

        ArrayAdapter<String> foodAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,myList1);
        foodAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(foodAdapter1);
    }

}
