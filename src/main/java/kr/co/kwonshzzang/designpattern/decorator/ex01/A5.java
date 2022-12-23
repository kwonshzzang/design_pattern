package kr.co.kwonshzzang.designpattern.decorator.ex01;

public class A5 extends AudiDecorator{
    public A5(ICar audi, String modelName) {
        super(audi, modelName, 3000);
    }
}
