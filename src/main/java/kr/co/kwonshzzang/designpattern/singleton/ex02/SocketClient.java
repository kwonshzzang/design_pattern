package kr.co.kwonshzzang.designpattern.singleton.ex02;

public class SocketClient {
    private static SocketClient socketClient = new SocketClient();

    private SocketClient() {
    }

    public static SocketClient getInstance() {
        if(socketClient == null) {
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }
}
