package com.pinyougou.sellergoods.service.impl;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2021/1/7 10:50
 * version 1.0
 * Description: 测试
 */

import com.alibaba.dubbo.config.annotation.Service;

import com.pinyougou.mapper.BrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *
 */
@Service(interfaceClass = BrandService.class)
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<TbBrand> queryAll() {
        return brandMapper.queryAll();
    }

//    @Override
//    public PageResult findPage(int pageNum, int pageSize) {
//
//        PageHelper.startPage(pageNum,pageSize);//分页
//        Page<TbBrand> page = (Page<TbBrand>) brandMapper.queryAll();
//
//        return new PageResult(page.getTotal(),page.getResult());
//    }

}
