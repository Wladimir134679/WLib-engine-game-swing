package com.wdeath.game;

public interface GameScreen {

    public void open();
    public void draw(GameCanvas canvas);
    public void update(float delta);
    public void close();
}
