package com.pinyougou.sellergoods.service;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2021/1/9 20:06
 * version 1.0
 * Description: 测试
 */

import com.pinyougou.pojo.TbBrand;
import entity.PageResult;

import java.util.List;

/**
 * 品牌接口
 */
public interface BrandService {
    public List<TbBrand> findAll();

    /**
     * 品牌分页
     * @param pageNum 当前页码
     * @param pageSize 每页记录数
     * @return
     */
    public PageResult findPage(int pageNum,int pageSize);
}
