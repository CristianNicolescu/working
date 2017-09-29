package com.cwc.iquestweeks.week3.pb3;

public class Point {
    private int x;
    private int y;

    /**
     * Initialized a point with two coordinates
     * @param x
     * @param y
     */
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
