package com.ssm.common;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Description:ajax请求结果集封装
 * @Author:童志杰
 * @Since:2018年1月10日
 */

public class ResponseData<T> implements Serializable {

    /**
     * 设置成功和失败常量
     */
    public final static int SUCCESS = 1;
    public final static int ERROR = 0;

    private int status;
    private String msg;
    private T data;

    private ResponseData() {
        super();
    }

    private ResponseData(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static <T> ResponseData<T> Success() {
        return new ResponseData<T>(ResponseData.SUCCESS, null, null);
    }

    public static <T> ResponseData<T> SuccessByMsg(String msg) {
        return new ResponseData<T>(ResponseData.SUCCESS, msg, null);
    }

    public static <T> ResponseData<T> SuccessByData(String msg, T data) {
        return new ResponseData<T>(ResponseData.SUCCESS, msg, data);
    }

    public static <T> ResponseData<T> SuccessByData(T data) {
        return new ResponseData<T>(ResponseData.SUCCESS, null, data);
    }



    public static <T> ResponseData<T> Error() {
        return new ResponseData<T>(ResponseData.ERROR, null, null);
    }

    public static <T> ResponseData<T> SErrorByMsg(String msg) {
        return new ResponseData<T>(ResponseData.ERROR, msg, null);
    }

    public static <T> ResponseData<T> ErrorByData(String msg, T data) {
        return new ResponseData<T>(ResponseData.ERROR, msg, data);
    }

    public static <T> ResponseData<T> ErrorByData(T data) {
        return new ResponseData<T>(ResponseData.ERROR, null, data);
    }


    public Boolean isSuccess() {
        if (status == SUCCESS) {
            return true;
        } else {
            return false;
        }
    }

}
