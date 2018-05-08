package com.ssm.common;

import java.util.Objects;

/**
 * 
 *@Description:ajax请求结果集封装
 *@Author:童志杰
 *@Since:2018年1月10日
 */

public class ResultDataState<T> {

	/**
	 * 设置成功和失败常量
	 */
	public final static String SUCCESS = "1";
	public final static String ERROR = "0";
	
	private String code;
	private String msg;
	private Boolean isSuccess;
	private T resultData;




	public ResultDataState(String code) {
		super();
		if(Objects.equals(code, SUCCESS)) {
			isSuccess = true;
		}else {
			isSuccess = false;
		}
		this.code = code;
	}


	public ResultDataState(String code, String msg) {
		super();
		if(Objects.equals(code, SUCCESS)) {
			isSuccess = true;
		}else {
			isSuccess = false;
		}
		this.code = code;
		this.msg = msg;
	}


	public ResultDataState() {
		super();
		isSuccess = true;
		this.msg = "默认值";
		this.code = SUCCESS;
	}
	

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

	public Boolean getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public Object getResultData() {
		return resultData;
	}

	public void setResultData(T resultData) {
		this.resultData = resultData;
	}

	public void SUCCESS() {
		this.code = SUCCESS;
		isSuccess = true;
	}

	public void SUCCESS(String msg) {
		this.code = SUCCESS;
		this.msg = msg;
		isSuccess = true;
	}

	public void SUCCESS(String msg, T resultData) {
		this.code = SUCCESS;
		this.msg = msg;
		this.resultData = resultData;
		isSuccess = true;
	}

	public void SUCCESS(T resultData) {
		this.code = SUCCESS;
		this.resultData = resultData;
		isSuccess = true;
	}

	public void ERROR() {
		this.code = ERROR;
		isSuccess = false;
	}

	public void ERROR(String msg) {
		this.code = ERROR;
		this.msg = msg;
		isSuccess = false;
	}

	public void ERROR(String msg, T resultData) {
		this.code = ERROR;
		this.msg = msg;
		this.resultData = resultData;
		isSuccess = false;
	}

	public void ERROR(T resultData) {
		this.code = ERROR;
		this.resultData = resultData;
		isSuccess = false;
	}

	public Boolean isSuccess() {
		if (code == SUCCESS) {
			return true;
		} else {
			return false;
		}
	}

}
