package kr.co.kwonshzzang.designpattern.templatemethod.ex01;

public class Main {
    public static void main(String[] args) {
        //'H'를 가진 CharDisplay 인스턴스를 1개 만든다.
        AbstractDisplay d1 = new CharDisplay('H');
        //"Hello, woirld."를 가진 StringDisplay의 인스턴스 1개를 만든다.
        AbstractDisplay d2 = new StringDisplay("Hello, world.");
        //"안녕하세요."를 가진 StringDisplay의 인스턴스를 1개 만든다.
        AbstractDisplay d3 = new StringDisplay("안녕하세요.");

        d1.display();   //d1, d2, d3 모두 같은 AbstractDisplay의
                        //하위 클래스의 인스턴스이기 때문에
        d2.display();   //상속한 display 메소드를 호출할 수 있다.
        d3.display();   //실제 동작은 CharDisplay나 StringDisplay에서 결정한다.
    }
}
