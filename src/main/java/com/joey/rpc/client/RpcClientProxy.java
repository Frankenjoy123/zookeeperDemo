package com.joey.rpc.client;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by xiaowu.zhou@tongdun.cn on 2018/6/19.
 */
public class RpcClientProxy {

    public <T> T clientProxy(Class<T> clazz , String host , int port){

        return (T) Proxy.newProxyInstance(clazz.getClassLoader(),
                clazz.getInterfaces(), new RemoteInvocationHandler(host , port));

    }
}
