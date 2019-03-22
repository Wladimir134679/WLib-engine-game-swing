package com.wdeath.game;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameCanvas {

    private JPanel canvas;
    private BufferedImage buf;

    public GameCanvas(int w, int h){
        canvas = new JPanel();
        canvas.setPreferredSize(new Dimension(w, h));
        canvas.setFocusable(true);
        buf = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
    }

    public Graphics2D getGraphics(){
        return (Graphics2D)buf.getGraphics();
    }

    public void repaint(){
        Graphics2D g = (Graphics2D) canvas.getGraphics();
        g.drawImage(buf, 0, 0, null);
    }

    public JPanel getCanvas(){
        return canvas;
    }
}
