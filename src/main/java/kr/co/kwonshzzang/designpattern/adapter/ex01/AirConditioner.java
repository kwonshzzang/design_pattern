package kr.co.kwonshzzang.designpattern.adapter.ex01;

public class AirConditioner implements Electronic220V {
    @Override
    public void connect() {
        System.out.println("에어콘 220V on");
    }
}
