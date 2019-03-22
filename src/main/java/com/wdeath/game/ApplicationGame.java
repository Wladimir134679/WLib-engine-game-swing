package com.wdeath.game;

import java.awt.*;

public class ApplicationGame {

    private GameWindow window;
    private GameCanvas canvas;
    private AppConfig config;
    private GameScreen screen;
    private ThreadEngine threadEngine;

    public ApplicationGame(AppConfig config, GameScreen game){
        this.config = config;
        this.screen = game;
        window = new GameWindow(config.title);
        canvas = new GameCanvas(config.width, config.height);
        threadEngine = new ThreadEngine(this);
    }

    public void start(){
        window.setCanvas(canvas);
        window.show();
        threadEngine.start();
    }

    public AppConfig getConfig(){
        return config;
    }

    public GameCanvas getCanvas(){
        return canvas;
    }

    public GameScreen getScreen(){
        return screen;
    }
}
