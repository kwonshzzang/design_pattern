package kr.co.kwonshzzang.designpattern.decorator.ex02;

public abstract class Border extends Display {
    protected Display display;          //이 장식이 둘러싸고 있는 '내용물'

    protected Border(Display display) { //인스턴스 생성시에 '내용물'을 인수로 지정
        this.display = display;
    }
}
