package com.joey.rpc.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by xiaowu.zhou@tongdun.cn on 2018/6/13.
 */
public class ServerDemo {

    public static void main(String[] args) {


        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(8888);

            while (true){

                Socket socket = serverSocket.accept();

                ExecutorProcessHander.doProcess(new ProcessRunnale(socket));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
