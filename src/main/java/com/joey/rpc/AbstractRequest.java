package com.joey.rpc;

import java.lang.reflect.Method;

/**
 * Created by xiaowu.zhou@tongdun.cn on 2018/6/13.
 */
public class AbstractRequest {

    private Class<?> clazz;

    private Method method;

    private Object[] params;

    public AbstractRequest(Class<?> clazz, Method method, Object[] params) {
        this.clazz = clazz;
        this.method = method;
        this.params = params;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }
}
