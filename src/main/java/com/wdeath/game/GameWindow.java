package com.wdeath.game;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GameWindow {

    private JFrame frame;

    public GameWindow(String title, ApplicationGame app){
        frame = new JFrame();
        frame.setTitle(title);
        frame.setDefaultCloseOperation(app.getConfig().operationCloseFrame);
    }

    public GameWindow addWindowListener(WindowListener w){
        frame.addWindowListener(w);
        return this;
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

    public JFrame getFrame(){
        return frame;
    }

}
