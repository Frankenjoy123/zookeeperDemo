package com.joey.rpc.client;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by xiaowu.zhou@tongdun.cn on 2018/6/19.
 */
public class RemoteInvocationHandler implements InvocationHandler{

    private String host;

    private int port;

    public RemoteInvocationHandler(String host, int port) {
        this.host = host;
        this.port = port;
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {




        return null;
    }
}
