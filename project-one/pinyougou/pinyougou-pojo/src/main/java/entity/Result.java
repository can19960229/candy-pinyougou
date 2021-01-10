package entity;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2021/1/10 15:04
 * version 1.0
 * Description: 测试
 */

import java.io.Serializable;

/**
 *
 */
public class Result implements Serializable {

    private boolean success; // 是否成功
    private String message; //返回信息

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
