package kr.co.kwonshzzang.designpattern.adapter.ex01;

public class HairDryer implements Electronic110V {
    @Override
    public void poweOn() {
        System.out.println("헤어 드라이기 110V on");
    }
}
