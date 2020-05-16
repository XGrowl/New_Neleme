package com.k.neleme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import com.duma.ld.mylibrary.SwitchView;
import com.k.neleme.adapters.orderFoodAdapter;
import com.k.neleme.bean.FoodBean;

import java.util.ArrayList;
import java.util.List;

public class orderConfirmationActivity extends AppCompatActivity {

    SwitchView swichType;
    TextView deliverType;
    List<FoodBean> orderList=new ArrayList<>();
    RecyclerView orderFoodRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_order_confirmation);
        swichType=findViewById(R.id.swichType);
        deliverType=findViewById(R.id.deliver_type);
        orderFoodRecycler=findViewById(R.id.order_food_recycler);
        orderFoodRecycler.setLayoutManager(new LinearLayoutManager(this));
//        Intent intent=new Intent();
////       getIntent().getSergetSerializable("orderList");
//        if(orderList==null)
//            Toast.makeText(this,"Toastxxxxxxxxx",Toast.LENGTH_LONG).show();
//       else
        MyApp app= (MyApp) getApplicationContext();
        List<FoodBean> flist = app.getFlist();
        orderFoodRecycler.setAdapter(new orderFoodAdapter(flist));
//        swichType.setOnClickCheckedListener(new SwitchView.onClickCheckedListener() {
//            @Override
//            public void onClick() {
//                Toast.makeText(getBaseContext(), "type:" + swichType.isChecked(), Toast.LENGTH_SHORT).show();
//            }
//        });
        swichType.setOnClickCheckedListener(new SwitchView.onClickCheckedListener() {
            @Override
            public void onClick() {
                if (swichType.isChecked())
                {
                    deliverType.setText("一层候餐区 登待");
                }
                else
                {
                    deliverType.setText("至aaa楼bbb层ccc1套间");
                }
            }
        });
    }
}
