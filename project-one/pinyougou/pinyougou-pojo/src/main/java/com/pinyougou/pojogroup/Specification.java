package com.pinyougou.pojogroup;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2021/1/11 16:37
 * version 1.0
 * Description: 测试
 */

import com.pinyougou.pojo.TbSpecification;
import com.pinyougou.pojo.TbSpecificationOption;

import java.io.Serializable;
import java.util.List;

/**
 * 规格组合实体类
 *      也可以用mybatis关联，但是会影响mysql分片的执行效率
 */
public class Specification implements Serializable {

    // {specification：{} ， specificationOptionList:[ { } ] }

    private TbSpecification specification;  //规格名称

    private List<TbSpecificationOption> specificationOptionList; //规格选项列表

    public TbSpecification getSpecification() {
        return specification;
    }

    public void setSpecification(TbSpecification specification) {
        this.specification = specification;
    }

    public List<TbSpecificationOption> getSpecificationOptionList() {
        return specificationOptionList;
    }

    public void setSpecificationOptionList(List<TbSpecificationOption> specificationOptionList) {
        this.specificationOptionList = specificationOptionList;
    }
}
