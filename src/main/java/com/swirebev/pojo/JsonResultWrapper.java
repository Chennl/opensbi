package com.swirebev.pojo;

import java.io.Serializable;

public class JsonResultWrapper<T> implements Serializable {
    private static final long serialVersionUID = -4699713095477151086L;

    /**
     * 数据
     */
    private T data;
    /**
     * 信息
     */
    private String message;
    /**
     * 是否成功
     */
    private boolean success;

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public JsonResultWrapper() {
        super();
    }

    public JsonResultWrapper(T data, String message, boolean success) {
        this.data = data;
        this.message = message;
        this.success = success;
    }

    public JsonResultWrapper(T data, String message) {
        this.data = data;
        this.message = message;
        this.success = true;
    }
    public JsonResultWrapper(boolean success, String message) {
        this.data = null;
        this.message = message;
        this.success = success;
    }
    public JsonResultWrapper(T data) {
        this.data = data;
        this.success = true;
    }
}  
