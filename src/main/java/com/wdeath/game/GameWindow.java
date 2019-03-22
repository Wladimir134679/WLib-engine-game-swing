package com.wdeath.game;

import javax.swing.*;

public class GameWindow {

    private JFrame frame;

    public GameWindow(String title){
        frame = new JFrame();
        frame.setTitle(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public GameWindow setCanvas(GameCanvas canvas){
        frame.add(canvas.getCanvas());
        frame.pack();
        return this;
    }

    public void show(){
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
