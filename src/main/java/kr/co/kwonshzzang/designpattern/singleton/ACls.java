package kr.co.kwonshzzang.designpattern.singleton;

public class ACls {
    private SocketClient socketClient;

    public ACls() {
        socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }

}
