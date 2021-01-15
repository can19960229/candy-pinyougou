package com.pinyougou.pojogroup;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2021/1/14 10:21
 * version 1.0
 * Description: 测试
 */

import com.pinyougou.pojo.TbGoods;
import com.pinyougou.pojo.TbGoodsDesc;
import com.pinyougou.pojo.TbItem;

import java.io.Serializable;
import java.util.List;

/**
 * 商品组合实体类
 */
public class Goods implements Serializable {

    private TbGoods goods; //商品基本信息

    private TbGoodsDesc goodsDesc;//商品SPU扩展信息


    private List<TbItem> itemList;//SKU列表

    public TbGoods getGoods() {
        return goods;
    }

    public void setGoods(TbGoods goods) {
        this.goods = goods;
    }

    public TbGoodsDesc getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(TbGoodsDesc goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public List<TbItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<TbItem> itemList) {
        this.itemList = itemList;
    }


}
