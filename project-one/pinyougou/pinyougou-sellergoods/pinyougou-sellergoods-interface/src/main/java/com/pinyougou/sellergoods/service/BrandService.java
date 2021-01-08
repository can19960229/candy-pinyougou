package com.pinyougou.sellergoods.service;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2021/1/7 15:34
 * version 1.0
 * Description: 测试
 */

import com.pinyougou.pojo.TbBrand;


import java.util.List;

/**
 *
 */
public interface BrandService {

    /**
     * 查询所有品牌数据
     * @return
     */
    public List<TbBrand> queryAll();

    /**
     * 品牌分页
     * @param pageNum 当前页码
     * @param pageSize  每页记录数
     * @return
     */
//    public PageResult findPage(int pageNum,int pageSize);

}
