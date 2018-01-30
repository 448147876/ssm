package com.ssm.common;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Description: 结果集处理返回数据
 * @Author: 童志杰
 * @CreateDate: 2018/1/29 15:50
 * @UpdateUser: 童志杰
 */
@JsonSerialize(include =  JsonSerialize.Inclusion.NON_NULL)
public class ReturnData<T> implements Serializable {

	public final static int SUCCESS = 1;
	public final static int ERROR = 0;
	public final static Boolean TRUE = true;
	public final static Boolean FALSE = false;

	private int status;
	private String msg;
	@JsonIgnore
	private Boolean success;
	private T data;


	public int getStatus() {
		return status;
	}

	private void setStatus(int status) {
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

	public static <T> ReturnData<T> SUCCESS() {
		ReturnData<T> returnData = new ReturnData<T>();

		returnData.setStatus(SUCCESS);
		returnData.setSuccess(true);


		return returnData;
	}

	public static <T> ReturnData<T> SUCCESS(String msg) {
		ReturnData<T> returnData = new ReturnData<T>();

		returnData.setStatus(SUCCESS);
		returnData.setSuccess(true);
		returnData.setMsg(msg);


		return returnData;
	}


	public static <T> ReturnData<T> SUCCESS(String msg, T data) {
		ReturnData<T> returnData = new ReturnData<T>();

		returnData.setStatus(SUCCESS);
		returnData.setSuccess(true);
		returnData.setMsg(msg);

		returnData.setData(data);

		return returnData;
	}


	public static <T> ReturnData<T> SUCCESS(T data) {
		ReturnData<T> returnData = new ReturnData<T>();

		returnData.setStatus(SUCCESS);
		returnData.setSuccess(true);

		returnData.setData(data);

		return returnData;
	}


	public static <T> ReturnData<T> ERROR() {
		ReturnData<T> returnData = new ReturnData<T>();

		returnData.setStatus(ERROR);
		returnData.setSuccess(false);


		return returnData;
	}

	public static <T> ReturnData<T> ERROR(String msg) {
		ReturnData<T> returnData = new ReturnData<T>();

		returnData.setStatus(ERROR);
		returnData.setSuccess(false);
		returnData.setMsg(msg);


		return returnData;
	}


	public static <T> ReturnData<T> ERROR(String msg, T data) {
		ReturnData<T> returnData = new ReturnData<T>();

		returnData.setStatus(ERROR);
		returnData.setSuccess(false);
		returnData.setMsg(msg);

		returnData.setData(data);

		return returnData;
	}


	public static <T> ReturnData<T> ERROR(T data) {
		ReturnData<T> returnData = new ReturnData<T>();

		returnData.setStatus(ERROR);
		returnData.setSuccess(false);

		returnData.setData(data);

		return returnData;
	}


	public Boolean isSuccess() {
		if (status == SUCCESS) {
			return true;
		} else {
			return false;
		}
	}


}
