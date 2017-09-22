package com.example.administrator.eshop.activity.mode;
import com.google.gson.annotations.SerializedName;

// 商品详情的响应体
public class GoodsInfoRsp extends ResponseEntity {

    @SerializedName("data")
    private GoodsInfo mData;

    public GoodsInfo getData() {
        return mData;
    }

}
