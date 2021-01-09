package com.pinyougou.sellergoods.service.impl;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2021/1/9 20:08
 * version 1.0
 * Description: 测试
 */

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private TbBrandMapper brandMapper;

    @Override
    public List<TbBrand> findAll() {
        return brandMapper.selectByExample(null);
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {

        PageHelper.startPage(pageNum,pageSize);//分页
        Page<TbBrand> page = (Page<TbBrand>) brandMapper.selectByExample(null);

        return new PageResult(page.getTotal(),page.getResult());

    }
}