package com.neatlife.mycase.handshake;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket socket = new ServerSocket(8881);
        socket.accept();
        TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
    }
}