package com.example.test4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<thongbao> arrtb;
    thongbaoadapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.listviewtb);
        arrtb = new ArrayList<>();
        arrtb.add(new thongbao(R.drawable.coffee,"Dặt hàng thành công !","52 phút trước"));
        arrtb.add(new thongbao(R.drawable.coffee,"Mua hàng thành công !","50 phút trước"));
        arrtb.add(new thongbao(R.drawable.coffeehouse,"Khuyến mãi coffeeHouse mua 1 tặng 1 đến hết ngày 25/12/2020 !","40 phút trước"));
        arrtb.add(new thongbao(R.drawable.coffeeden,"Đặt hàng thành công !","30 phút trước"));
        arrtb.add(new thongbao(R.drawable.coffeeden,"Mua hàng thành công !","27 phút trước"));
        adapter = new thongbaoadapter(this,R.layout.item_menu,arrtb);
        lv.setAdapter(adapter);
    }
}