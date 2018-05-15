package com.ssm.common;



import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;
import java.util.Objects;

//保证序列化json的时候,如果是null的对象,key也会消失
@JsonSerialize(include =  JsonSerialize.Inclusion.NON_NULL)
public class ServerResponse<T> implements Serializable {

    public final static String SUCCESS = "1";
    public final static String ERROR = "0";
    public final static Boolean TRUE = true;
    public final static Boolean FALSE = false;

    private String status;
    private String msg;
    @JsonIgnore
    private Boolean success;
    private T data;


    public String getStatus() {
        return status;
    }

    private void setStatus(String status) {
        this.status = status;
        if(Objects.equals(status,SUCCESS)){
            success = TRUE;
        }else{
            success = FALSE;
        }
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getSuccess() {
        return success;
    }

    private void setSuccess(Boolean success) {
        this.success = success;

        if(Objects.equals(status,SUCCESS)){
            success = TRUE;
        }else{
            success = FALSE;
        }

    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> ServerResponse<T> SUCCESS() {
        ServerResponse<T> ServerResponse = new ServerResponse<T>();

        ServerResponse.setStatus(SUCCESS);
        ServerResponse.setSuccess(true);


        return ServerResponse;
    }

    public static <T> ServerResponse<T> SUCCESS(String msg) {
        ServerResponse<T> ServerResponse = new ServerResponse<T>();

        ServerResponse.setStatus(SUCCESS);
        ServerResponse.setSuccess(true);
        ServerResponse.setMsg(msg);


        return ServerResponse;
    }


    public static <T> ServerResponse<T> SUCCESS(String msg, T data) {
        ServerResponse<T> ServerResponse = new ServerResponse<T>();

        ServerResponse.setStatus(SUCCESS);
        ServerResponse.setSuccess(true);
        ServerResponse.setMsg(msg);

        ServerResponse.setData(data);

        return ServerResponse;
    }


    public static <T> ServerResponse<T> SUCCESS(T data) {
        ServerResponse<T> ServerResponse = new ServerResponse<T>();

        ServerResponse.setStatus(SUCCESS);
        ServerResponse.setSuccess(true);

        ServerResponse.setData(data);

        return ServerResponse;
    }


    public static <T> ServerResponse<T> ERROR() {
        ServerResponse<T> ServerResponse = new ServerResponse<T>();

        ServerResponse.setStatus(ERROR);
        ServerResponse.setSuccess(false);


        return ServerResponse;
    }

    public static <T> ServerResponse<T> ERROR(String msg) {
        ServerResponse<T> ServerResponse = new ServerResponse<T>();

        ServerResponse.setStatus(ERROR);
        ServerResponse.setSuccess(false);
        ServerResponse.setMsg(msg);


        return ServerResponse;
    }


    public static <T> ServerResponse<T> ERROR(String msg, T data) {
        ServerResponse<T> ServerResponse = new ServerResponse<T>();

        ServerResponse.setStatus(ERROR);
        ServerResponse.setSuccess(false);
        ServerResponse.setMsg(msg);

        ServerResponse.setData(data);

        return ServerResponse;
    }


    public static <T> ServerResponse<T> ERROR(T data) {
        ServerResponse<T> ServerResponse = new ServerResponse<T>();

        ServerResponse.setStatus(ERROR);
        ServerResponse.setSuccess(false);

        ServerResponse.setData(data);

        return ServerResponse;
    }


    public Boolean isSuccess() {
        if (status == SUCCESS) {
            return true;
        } else {
            return false;
        }
    }











}
