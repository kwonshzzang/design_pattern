package kr.co.kwonshzzang.designpattern.proxy.ex03;

import kr.co.kwonshzzang.designpattern.proxy.ex02.Printable;

public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice", "kr.co.kwonshzzang.designpattern.proxy.ex02.Printer");
        System.out.println("이름은 현재 " + p.getPrinterName() + " 입니다.");

        p.setPrinterName("Bob");
        System.out.println("이름은 현재 " + p.getPrinterName() + " 입니다.");

        p.print("Hello, world");
    }
}
