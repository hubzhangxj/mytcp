package com.neatlife.mycase.wave;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8881);
        Socket socket = serverSocket.accept();
        socket.close();
        serverSocket.close();
    }
}