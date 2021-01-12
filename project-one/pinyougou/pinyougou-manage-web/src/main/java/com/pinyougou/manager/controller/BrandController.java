package com.pinyougou.manager.controller;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2021/1/9 20:12
 * version 1.0
 * Description: 测试
 */

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.container.page.Page;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import entity.PageResult;
import entity.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 *
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
    @Reference
    private BrandService brandService;

    @RequestMapping("/findAll")
    public List<TbBrand> findAll(){
        return brandService.findAll();
    }

    /**
     * 后端给前端的数据：
     *      总记录数 total
     *      当前页记录 rows
     *    {total:100,rows:[]}
     *     方法一：
     *      Map map = new HashMap();
     *      map.put('total',100);
     *      map.put('rows',list);
     *      return map;
     *      方法二：
     *      创建类  包含 total和 rows 属性
     *
     *  前端给后端的数据：
     *      当前页
     *      每页记录数
     *
     *
     * @param page 当前页数
     * @param size 每页记录数
     * @return
     */

    @RequestMapping("/findPage")
    public PageResult findPage(int page,int size){
        return brandService.findPage(page, size);
    }

    /**
     * 保存方法需要返回一个类型，可通过两种方法进行传递
     *      [success:true,message:"保存成功"]
     *   方法一：
     *      Map map = new HashMap();
     *      map.put('success',true);
     *      map.put('message',"保存成功");
     *      return map;
     *   方法二：
     *      创建类：包含success  和  message
     * @param brand 品牌
     */
    @RequestMapping("/add")
    public Result add(@RequestBody TbBrand brand){//对象类型的参数要指定注解，前端传递过来是通过Post传递过来
        try {
            brandService.add(brand);
            return new Result(true,"增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"增加失败");
        }
    }

    /**
     * 根据id查询
     * @param id 品牌数据的id
     * @return 返回查询到的数据
     */
    @RequestMapping("/findOne")
    public TbBrand findOne(Long id){
        return brandService.findOne(id);
    }

    /**
     * 更新数据
     * @param brand
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody TbBrand brand){
        try {
            brandService.update(brand);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

    @RequestMapping("/delete")
    public Result delete(long[] ids){
        try {
            brandService.delete(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }


    @RequestMapping("/search")
    public PageResult search(@RequestBody TbBrand brand,int page,int size){
        return brandService.findPage(brand, page, size);
    }

    @RequestMapping("/selectOptionList")
    public List<Map> selectOptionList(){
        return brandService.selectOptionList();
    }



}
