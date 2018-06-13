package com.joey.rpc.server;

import com.joey.rpc.AbstractRequest;

/**
 * Created by xiaowu.zhou@tongdun.cn on 2018/6/13.
 */
public class Invocation {

    private AbstractRequest request;

    public Invocation(AbstractRequest request) {
        this.request = request;
    }

    public <T> T getResult(AbstractRequest request){


        Class<?> clazz = request.getClazz();
        try {
            Object object = clazz.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }
}
