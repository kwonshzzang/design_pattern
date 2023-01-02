package kr.co.kwonshzzang.designpattern.singleton.ex01;

public class NormalStrategy implements EncodingStrategy {
    @Override
    public String encode(String text) {
        return text;
    }
}
