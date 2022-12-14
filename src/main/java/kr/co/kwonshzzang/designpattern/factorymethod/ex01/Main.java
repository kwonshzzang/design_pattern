package kr.co.kwonshzzang.designpattern.factorymethod.ex01;

import kr.co.kwonshzzang.designpattern.factorymethod.ex01.framework.Factory;
import kr.co.kwonshzzang.designpattern.factorymethod.ex01.framework.Product;
import kr.co.kwonshzzang.designpattern.factorymethod.ex01.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();

        Product card1 = factory.create("홍길동");
        Product card2 = factory.create("이순신");
        Product card3 = factory.create("강감찬");

        card1.use();;
        card2.use();
        card3.use();
    }
}
