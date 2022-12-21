package kr.co.kwonshzzang.designpattern.proxy.ex01;

import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {

//        IBrowser browser = new Browser("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();

//        IBrowser browser = new BrowserProxy("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser browser = new AopBrowser("www.naver.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
                );

        browser.show();
        System.out.println("loading time " +  end.get());

        browser.show();
        System.out.println("loading time " +  end.get());

    }
}
