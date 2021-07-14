package com.yyww.mysql.jdbc.utils;


import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.io.Serializable;

@Data
public class JsonResponse<T> implements Serializable {

    private int code = 0;
    private String message = "";
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public JsonResponse() {
    }

    public JsonResponse(T data) {
        this.data = data;
    }

    public static JsonResponse create() {
        return new JsonResponse();
    }

    public String toJsonString() {
        return JSON.toJSONString(this);
    }

    public static <T> JsonResponse<T> ok(T data) {
        JsonResponse<T> resp = new JsonResponse<>(data);
        resp.setCode(0);
        return resp;
    }

    public static <T> JsonResponse<T> ok() {
        JsonResponse<T> resp = new JsonResponse<>();
        resp.setCode(0);
        return resp;
    }

}