package kr.co.kwonshzzang.designpattern.adapter;

public class SocketAdapter implements Electronic110V {
    private Electronic220V electronic220V;

    public SocketAdapter(Electronic220V electronic220V) {
        this.electronic220V = electronic220V;
    }

    @Override
    public void poweOn() {
        electronic220V.connect();
    }
}
