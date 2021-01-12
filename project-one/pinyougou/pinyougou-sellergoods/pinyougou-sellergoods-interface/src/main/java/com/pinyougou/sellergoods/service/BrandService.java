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
import java.util.Map;

/**
 * 品牌接口
 */
public interface BrandService {

    /**
     * 查询所有品牌
     * @return
     */
    public List<TbBrand> findAll();

    /**
     * 品牌分页
     * @param pageNum 当前页码
     * @param pageSize 每页记录数
     * @return
     */
    public PageResult findPage(int pageNum,int pageSize);

    /**
     * 增加品牌
     * @param brand
     */
    public void add(TbBrand brand);

    /**
     * 根据ID查询实体
      * @param id
     * @return
     */
    public TbBrand findOne(Long id);

    /**
     * 修改
     * @param brand
     */
    public void update(TbBrand brand);

    /**
     * 删除
     * @param ids 多个id
     */
    public void delete(long[] ids);


    /**
     * 根据品牌条件查询
     * @param brand
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageResult findPage(TbBrand brand,int pageNum,int pageSize);

    /**
     * 品牌下拉框数据
     */
    List<Map> selectOptionList();


}
