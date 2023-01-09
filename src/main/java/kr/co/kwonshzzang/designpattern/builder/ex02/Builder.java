package kr.co.kwonshzzang.designpattern.builder.ex02;

public interface Builder {
    void makeTitle(String title);
    void makeString(String str);
    void makeItems(String[] items);
    void close();
}
