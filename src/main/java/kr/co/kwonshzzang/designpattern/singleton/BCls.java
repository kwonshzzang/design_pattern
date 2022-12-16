package kr.co.kwonshzzang.designpattern.singleton;

public class BCls {
    private SocketClient socketClient;

    public BCls() {
        socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
