package kr.co.kwonshzzang.designpattern.decorator.ex02;

public class StringDisplay extends Display {
    private String string;                 //표시 문자열

    public StringDisplay(String string) {  //인수로 표시 문자열을 지정
        this.string = string;
    }

    @Override
    public int getColumns() {              //문자수
        return string.getBytes().length;
    }

    @Override
    public int getRows() {                 //행수는 1
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if(row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
