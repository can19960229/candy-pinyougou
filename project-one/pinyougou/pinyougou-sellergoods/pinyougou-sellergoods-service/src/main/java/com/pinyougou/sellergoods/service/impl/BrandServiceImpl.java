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
import com.pinyougou.pojo.TbBrandExample;
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

    @Override
    public void add(TbBrand brand) {
        //增加时，需要判断增加的数据是否重复，
        // (1) 可以先查找数据是否重复，如果重复就插入不进去，(2)或者在数据库中添加名字为唯一约束
        brandMapper.insert(brand);
    }

    @Override
    public TbBrand findOne(Long id) {

        return brandMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(TbBrand brand) {
        brandMapper.updateByPrimaryKey(brand);
    }

    @Override
    public void delete(long[] ids) {

        for (long id : ids) {
            brandMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult findPage(TbBrand brand, int pageNum, int pageSize) {

        PageHelper.startPage(pageNum,pageSize);//分页

        TbBrandExample example = new TbBrandExample();

        TbBrandExample.Criteria criteria = example.createCriteria();

        if (brand != null){
            if (brand.getName() != null && brand.getName().length() >0){
                criteria.andNameLike("%"+brand.getName()+"%");  //模糊查询
            }
            if (brand.getFirstChar() != null && brand.getFirstChar().length() > 0){
                criteria.andFirstCharLike("%"+brand.getFirstChar()+"%");
            }
        }

        Page<TbBrand> page = (Page<TbBrand>) brandMapper.selectByExample(example);

        return new PageResult(page.getTotal(),page.getResult());

    }


}
