package entity;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2021/1/8 22:41
 * version 1.0
 * Description: 测试
 */

import java.io.Serializable;
import java.util.List;

/**
 * 分页结果封装对象
 */
public class PageResult implements Serializable {
    private long total;//总记录数
    private List rows;//当前页结果

    public PageResult(long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
