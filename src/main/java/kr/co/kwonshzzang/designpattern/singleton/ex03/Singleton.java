package kr.co.kwonshzzang.designpattern.singleton.ex03;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
