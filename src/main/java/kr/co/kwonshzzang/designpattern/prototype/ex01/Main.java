package kr.co.kwonshzzang.designpattern.prototype.ex01;

import kr.co.kwonshzzang.designpattern.prototype.ex01.anonymous.MessageBox;
import kr.co.kwonshzzang.designpattern.prototype.ex01.anonymous.UnderlinePen;
import kr.co.kwonshzzang.designpattern.prototype.ex01.framework.Manager;
import kr.co.kwonshzzang.designpattern.prototype.ex01.framework.Product;

public class Main {
    public static void main(String[] args) {
        //준비
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        //생성
        Product p1 = manager.create("strong message");
        p1.use("Hello, world");
        Product p2 = manager.create("warning box");
        p2.use("Hello, world");
        Product p3 = manager.create("slash box");
        p3.use("Hello, world");

    }
}
