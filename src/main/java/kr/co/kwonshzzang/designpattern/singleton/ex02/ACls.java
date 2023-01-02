package kr.co.kwonshzzang.designpattern.singleton.ex02;

public class ACls {
    private SocketClient socketClient;

    public ACls() {
        socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }

}
