package com.atguigu.cn.net;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Classname Server
 * @Description TODO
 * @Date 2020/5/19 9:56
 * @Created by 86153
 */
public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket accept = serverSocket.accept();

        /*InputStream inputStream = accept.getInputStream();

        int read = inputStream.read();

        System.out.println(read);*/


        ObjectInputStream objectInputStream = new ObjectInputStream(accept.getInputStream());

        User user = (User) objectInputStream.readObject();

        System.out.println(user.name);
    }
}
