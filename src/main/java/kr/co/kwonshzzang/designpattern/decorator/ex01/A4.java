package kr.co.kwonshzzang.designpattern.decorator.ex01;

public class A4 extends AudiDecorator {
    public A4(ICar audi, String modelName) {
        super(audi, modelName, 2000);
    }
}
