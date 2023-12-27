package com.itheima.controller;

import com.itheima.exception.BusinessException;
import com.itheima.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @autor: 我亦无他，唯手熟尔
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {
    // 系统异常
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex) {
        // 记录日志
        // 发送消息给运维
        // 发送邮件给开发人员, ex对象发送给开发人员
        return new Result(ex.getCode(), null, ex.getMessage());
    }

    // 业务异常
    @ExceptionHandler(BusinessException.class)
    public Result doSystemException(BusinessException ex) {
        return new Result(ex.getCode(), null, ex.getMessage());
    }

    // 处理其他异常
    @ExceptionHandler(Exception.class)
    public Result doSystemException(Exception ex) {
        return new Result(Code.SYSTEM_UNKNOWN_ERR, null, "系统繁忙，请稍后再试");
    }
}
