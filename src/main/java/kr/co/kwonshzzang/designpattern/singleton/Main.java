package kr.co.kwonshzzang.designpattern.singleton;

public class Main {
    public static void main(String[] args) {
        ACls aCls = new ACls();
        BCls bCls = new BCls();

        SocketClient aClient = aCls.getSocketClient();
        SocketClient bClient = bCls.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient == bClient);
    }
}
