package kr.co.kwonshzzang.designpattern.decorator.ex01;

public class A3 extends AudiDecorator {
    public A3(ICar audi, String modelName ) {
        super(audi, modelName, 1000);
    }
}
