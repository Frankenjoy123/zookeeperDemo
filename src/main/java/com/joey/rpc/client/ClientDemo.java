package com.joey.rpc.client;

import com.joey.rpc.ISportService;

/**
 * Created by xiaowu.zhou@tongdun.cn on 2018/6/13.
 */
public class ClientDemo {

    public static void main(String[] args) {
        ISportService sportService = null;

        sportService.doSport("篮球");
    }
}
