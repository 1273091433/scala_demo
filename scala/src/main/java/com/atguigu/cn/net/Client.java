package com.atguigu.cn.net;

import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2020/5/19 9:56
 * @Created by 86153
 */
public class Client {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost",9999);

        /*OutputStream outputStream = socket.getOutputStream();

        outputStream.write(10);

        outputStream.close();*/

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        User user = new User();
        user.name = "zhangsan";
        objectOutputStream.writeObject(user);

        objectOutputStream.close();

    }
}
