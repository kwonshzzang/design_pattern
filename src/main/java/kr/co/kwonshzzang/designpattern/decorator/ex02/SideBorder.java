package kr.co.kwonshzzang.designpattern.decorator.ex02;

public class SideBorder extends Border {
    private char borderChar;                    //장식이 되는 문자

    public SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {                   //문자수는 내용물의 양쪽에 장식 문자수를 더한 것
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {   //행수는 내용물의 행수와 동일
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {  //지정된 행의 내용은 내용물의 지정된 행의 양쪽에 장식 문자를 붙인 것
        return borderChar + display.getRowText(row) + borderChar;
    }
}
