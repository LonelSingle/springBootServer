package com.szh.model;

import java.util.List;

public class MyResult {
    private int code;
    private String msg;
    private List<?> list;
    private Object object;

    public MyResult() {
    }

    public MyResult(int code) {
        this.code = code;
    }

    public MyResult(int code, String msg, List<?> list, Object object) {
        this.code = code;
        this.msg = msg;
        this.list = list;
        this.object = object;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
