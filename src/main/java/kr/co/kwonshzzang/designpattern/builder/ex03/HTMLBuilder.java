package kr.co.kwonshzzang.designpattern.builder.ex03;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder {
    private String filename;                  // 작성할 파일명
    private PrintWriter writer;               // 파일에 쓸 PrintWriter

    @Override
    protected void buildTitle(String title) { // HTML 파일에서의 타이틀
        filename = title + ".html";

        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title +
                "</title></head><body>");  // 타이틀 출력
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    protected void buildString(String str) {  //HTML 파일에서의 문자열
        writer.println("<p>" + str + "</p>"); //<p> 태그로 출력
    }

    @Override
    protected void buildItems(String[] items) { //HTML 파일에서의 개별항목
        writer.println("<ul>");                 //<ul>과 <li>로 출력
        for(int i = 0; i< items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    protected void buildDone() { //문서의 완성
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() { //파일명을 반환한다
        return filename;
    }

}
