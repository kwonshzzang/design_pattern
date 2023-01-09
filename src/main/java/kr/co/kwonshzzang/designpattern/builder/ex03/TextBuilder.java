package kr.co.kwonshzzang.designpattern.builder.ex03;

public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();       //필드의 문서를 구축한다.
    @Override
    protected void buildTitle(String title) {
        buffer.append("================================================\n");    //장식선
        buffer.append("[" + title + "]\n");                                     //사용한 타이틀
        buffer.append("\n");                                                    //빈행
    }

    @Override
    protected void buildString(String str) {
        buffer.append("> " + str + "\n");       // > 글머리 기호 붙은 문자열
        buffer.append("\n");                    // 빈행
    }

    @Override
    protected void buildItems(String[] items) {
        for(int i = 0; i < items.length; i++) {
            buffer.append("  -" + items[i] + "\n"); // - 글머리 기호 붙은 항목
        }
        buffer.append("\n");                        //빈행
    }

    @Override
    protected void buildDone() {
        buffer.append("================================================\n");    //장식선
    }

    public String getResult() {     //완성한 문서
        return buffer.toString();       //StringBuffer를 String으로 변환
    }
}
