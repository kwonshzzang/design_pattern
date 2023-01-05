package kr.co.kwonshzzang.designpattern.builder.ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder {
    private String filename;                //작성할 파일명
    private PrintWriter writer;                  //파일에 기술할 Writer

    @Override
    public void makeTitle(String title) {   //HTML 파일에서의 타이틀
        filename = title + ".html";         //타이틀을 기초로 파일명을 결정
        try {
            writer = new PrintWriter(new FileWriter(filename)); //PrintWriter를 만든다.
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head>" +
                        "<body>");      //타이틀을 출력
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {        //HTML 파일에서의 문자열
        writer.println("<p>" + str + "</p>");   //<p> 태그로 출력
    }

    @Override
    public void makeItems(String[] items) {     //HTML 파일에서의 개별 항목
        writer.println("<ul>");
        for(int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {                   //문서의 완성
        writer.println("</body></html>");   //태그를 닫는다
        writer.close();                     //파일을 닫는다.
    }

    public String getResult() {             //완성한 문서
        return filename;                    //파일명을 반환한다.
    }
}
