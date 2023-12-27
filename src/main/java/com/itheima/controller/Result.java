package com.itheima.controller;

/**
 * @autor: 我亦无他，唯手熟尔
 */
public class Result {
    // 用于封装数据
    private Object data;
    // 状态码
    private Integer code;
    // 给用户返回的消息
    private String msg;

    // 定义三个构造方法
    public Result(Integer code, Object data, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, Object data) {
        this.data = data;
        this.code = code;
    }

    public Result() {
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
