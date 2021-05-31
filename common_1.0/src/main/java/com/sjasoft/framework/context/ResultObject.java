package com.sjasoft.framework.context;

import java.io.Serializable;

public class ResultObject implements Serializable {

	private static final long serialVersionUID = -5285032058479776032L;
	
	private boolean success = true;
	
	private int errcode = 0;
	
	private String message = "";
	
	private Object data = null;
	
	public static ResultObject success() {
		return new ResultObject();
	}
	public static ResultObject success(String message) {
		return new ResultObject(true, message);
	}
	public static ResultObject success(String message, Object data) {
		return new ResultObject(true, message, data);
	}
	
	public static ResultObject failure(String message) {
		return new ResultObject(false, message, -1, null);
	}
	public static ResultObject failure(String message, Object data) {
		return new ResultObject(false, message, -1, data);
	}
	public static ResultObject failure(String message, int errcode, Object data) {
		return new ResultObject(false, message, errcode, data);
	}
	
	protected ResultObject() {
		this.success = true;
	}
	protected ResultObject(boolean success, String message) {
		this.success = success;
		this.message = message;
	}
	protected ResultObject(boolean success, String message, Object data) {
		this.success = success;
		this.message = message;
		this.data = data;
	}
	protected ResultObject(boolean success, String message, int errcode, Object data) {
		this.success = success;
		this.message = message;
		this.errcode = errcode;
		this.data = data;
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public int getErrcode() {
		return errcode;
	}
	public void setErrcode(int errcode) {
		this.errcode = errcode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
