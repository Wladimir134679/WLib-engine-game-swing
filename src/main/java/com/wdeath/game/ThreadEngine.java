package com.wdeath.game;

import java.awt.*;

public class ThreadEngine implements Runnable {

    private Thread thread;
    private ApplicationGame app;

    public ThreadEngine(ApplicationGame game) {
        this.app = game;
        thread = new Thread(this);

    }

    public ThreadEngine start(){
        thread.start();
        return this;
    }

    @Override
    public void run() {
        GameScreen screen = app.getScreen();
//        app.getCanvas().getGraphics().setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        screen.open();

        while(true){
            clearCanvas(app.getCanvas().getGraphics());
            screen.draw(app.getCanvas());
            app.getCanvas().repaint();

            screen.update(1/60f);


            sleep(1000/70);
        }
    }

    private void clearCanvas(Graphics2D g){
        Color c = g.getColor();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, app.getConfig().width, app.getConfig().height);
        g.setColor(c);
    }

    private void sleep(long t){
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
