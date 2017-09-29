package com.cwc.iquestweeks.week3.pb3;


public class Line {
    private Point a;
    private Point b;
    /**
     * Initializes a line with two points
     */
    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }
}
