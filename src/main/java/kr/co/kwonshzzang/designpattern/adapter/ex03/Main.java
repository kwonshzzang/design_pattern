package kr.co.kwonshzzang.designpattern.adapter.ex03;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");

        p.printWeak();
        p.printStrong();
    }
}
