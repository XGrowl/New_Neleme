package com.k.neleme.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class orderList implements Serializable {
    List<FoodBean> result=new ArrayList<>();

    public List<FoodBean> getResult() {
        return result;
    }

    public void setResult(List<FoodBean> result) {
        this.result = result;
    }
}
