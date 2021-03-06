package com.thtf.common.core.exception;


import com.thtf.common.core.response.ResponseCode;

/**
 * ---------------------------
 * 异常工具类
 * ---------------------------
 * 作者：  pyy
 * 时间：  2019/12/26 17:29
 * 版本：  v1.0
 * ---------------------------
 */
public class ExceptionCast {

    // 使用此静态方法抛出自定义异常
    public static void cast(ResponseCode responseCode){
        throw new CustomException(responseCode);
    }
}
