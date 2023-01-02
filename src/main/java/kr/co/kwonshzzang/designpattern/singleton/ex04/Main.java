package kr.co.kwonshzzang.designpattern.singleton.ex04;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        for(int i = 0; i < 10; i++) {
            System.out.println(i + ":" + TicketMaker.getSingleton().getNextTicketNumber());
        }
        System.out.println("End.");
    }
}
