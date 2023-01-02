package kr.co.kwonshzzang.designpattern.singleton.ex01;

public class AppendStrategy implements EncodingStrategy {
    @Override
    public String encode(String text) {
        return "ABCD" + text;
    }
}
