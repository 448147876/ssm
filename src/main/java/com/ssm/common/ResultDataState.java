package com.ssm.common;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Description:ajax请求结果集封装
 * @Author:童志杰
 * @Since:2018年1月10日
 */

public class ResultDataState<T> implements Serializable {

    /**
     * 设置成功和失败常量
     */
    public final static String SUCCESS = "1";
    public final static String ERROR = "0";

    private String code;
    private String msg;
    private T resultData;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public T getResultData() {
        return resultData;
    }

    public void setResultData(T resultData) {
        this.resultData = resultData;
    }

    public void SUCCESS() {
        this.code = SUCCESS;
    }

    public void SUCCESS(String msg) {
        this.code = SUCCESS;
        this.msg = msg;
    }

    public void SUCCESS(String msg, T resultData) {
        this.code = SUCCESS;
        this.msg = msg;
        this.resultData = resultData;
    }

    public void SUCCESS(T resultData) {
        this.code = SUCCESS;
        this.resultData = resultData;
    }

    public void ERROR() {
        this.code = ERROR;
    }

    public void ERROR(String msg) {
        this.code = ERROR;
        this.msg = msg;
    }

    public void ERROR(String msg, T resultData) {
        this.code = ERROR;
        this.msg = msg;
        this.resultData = resultData;
    }

    public void ERROR(T resultData) {
        this.code = ERROR;
        this.resultData = resultData;
    }

    public Boolean isSuccess() {
        if (Objects.equals(code, SUCCESS)) {
            return true;
        } else {
            return false;
        }
    }

}
