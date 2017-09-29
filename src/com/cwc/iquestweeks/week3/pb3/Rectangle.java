package com.cwc.iquestweeks.week3.pb3;


public class Rectangle {
    private Point p1, p2, p3, p4;

    /**
     * Generates a rectangle from 2 lines
     * @param l1
     * @param l2
     */
    public Rectangle(Line l1, Line l2) {
        p1=l1.getA();
        p2=l1.getB();
        p3=l2.getA();
        p4=l2.getB();
    }

    /**
     * Generates a rectangle from 4 points
     * @param p1
     * @param p2
     * @param p3
     * @param p4
     */
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    /**
     * Generates the lines from the points of the rectangle
     * @return
     */
    public Line[] getLines()
    {
        Line[] lines=new Line[4];
        lines[0]=new Line(p1,p2);
        lines[1]=new Line(p2,p3);
        lines[2]=new Line(p3,p4);
        lines[3]=new Line(p4,p1);
        return lines;
    }
    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Point getP4() {
        return p4;
    }

    public void setP4(Point p4) {
        this.p4 = p4;
    }
}
