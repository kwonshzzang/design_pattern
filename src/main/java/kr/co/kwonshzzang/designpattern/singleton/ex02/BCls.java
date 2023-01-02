package kr.co.kwonshzzang.designpattern.singleton.ex02;

public class BCls {
    private SocketClient socketClient;

    public BCls() {
        socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
