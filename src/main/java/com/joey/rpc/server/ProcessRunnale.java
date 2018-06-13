package com.joey.rpc.server;

import com.joey.rpc.AbstractRequest;

import java.io.*;
import java.net.Socket;

/**
 * Created by xiaowu.zhou@tongdun.cn on 2018/6/13.
 */
public class ProcessRunnale implements Runnable{

    private Socket socket;

    public ProcessRunnale(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {


        ObjectInputStream inputStream = null;
        ObjectOutputStream outputStream = null;
        try {

            inputStream = new ObjectInputStream(socket.getInputStream());
            AbstractRequest request = (AbstractRequest) inputStream.readObject();

            Invocation invocation = new Invocation(request);
            Object object = invocation.getResult(request);

            outputStream = new ObjectOutputStream(socket.getOutputStream());
            outputStream.writeObject(object);
            outputStream.flush();



        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (outputStream!=null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
