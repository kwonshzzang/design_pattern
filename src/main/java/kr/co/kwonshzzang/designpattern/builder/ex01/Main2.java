package kr.co.kwonshzzang.designpattern.builder.ex01;

import javax.swing.*;

public class Main2 {
    public static void main(String[] args) {
        FrameBuilder frameBuilder = new FrameBuilder();
        Director director = new Director(frameBuilder);
        director.construct();
        JFrame frame = frameBuilder.getResult();
        frame.setVisible(true);
    }
}
