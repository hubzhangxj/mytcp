package com.neatlife.mycase.wave;

import java.net.Socket;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 8881);
        socket.close();
        TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
    }
}