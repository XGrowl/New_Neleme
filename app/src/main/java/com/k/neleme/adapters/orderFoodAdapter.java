package com.k.neleme.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.k.neleme.R;
import com.k.neleme.bean.FoodBean;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class orderFoodAdapter extends RecyclerView.Adapter<orderFoodAdapter.orderFoodViewHolder> {
    private Context mContext;
    private List<FoodBean> list=new ArrayList<>();
    public orderFoodAdapter(List<FoodBean> list)
    {
        this.list=list;
    }
    @NonNull
    @Override
    public orderFoodViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       if (mContext==null)
           mContext=viewGroup.getContext();
       View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_order_food,null,false);
       orderFoodViewHolder viewHolder=new orderFoodViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull orderFoodViewHolder orderFoodViewHolder, int i) {
      int position=i%7;
        FoodBean foodBean = list.get(position);
        int resourceId = mContext.getResources().getIdentifier("food" + ((i % 7) + 1), "drawable", mContext.getPackageName());
        orderFoodViewHolder.orderFoodImage.setImageResource(resourceId);
        orderFoodViewHolder.orderFoodPrice.setText(String.valueOf(foodBean.getPrice()));
        orderFoodViewHolder.orderFoodName.setText(String.valueOf(foodBean.getName()));
        orderFoodViewHolder.orderFoodNumber.setText(String.valueOf(foodBean.getSelectCount()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class orderFoodViewHolder extends RecyclerView.ViewHolder {
        private TextView orderFoodName;
        private ImageView orderFoodImage;
        private TextView orderFoodNumber;
        private TextView orderFoodPrice;
        public orderFoodViewHolder(@NonNull View itemView) {
            super(itemView);
            orderFoodImage=itemView.findViewById(R.id.order_food_image);
            orderFoodName=itemView.findViewById(R.id.order_food_name);
            orderFoodNumber=itemView.findViewById(R.id.order_food_number);
            orderFoodPrice=itemView.findViewById(R.id.order_food_price);
        }
    }
}
