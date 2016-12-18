package com.example.lovecalories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pageChoose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_choose);

        Button cBtn1 = (Button)findViewById(R.id.cBtn1);
        Button cBtn2 = (Button)findViewById(R.id.cBtn2);
        Button cBtn3 = (Button)findViewById(R.id.cBtn3);

        cBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itnC1 = new Intent(pageChoose.this,pageAdd1.class);
                startActivity(itnC1);
                finish();
            }
        });

        cBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itnC2 = new Intent(pageChoose.this,pageAdd2.class);
                startActivity(itnC2);
                finish();
            }
        });

        cBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itnC3 = new Intent(pageChoose.this,pageAdd3.class);
                startActivity(itnC3);
                finish();
            }
        });


    }
}
