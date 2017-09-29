package com.cwc.iquestweeks.week3.pb3;

public class Circle {
    private Point point;
    private double radius;

    /**
     * Initializes a circle using its center and the radius
     *
     * @param point
     * @param radius
     */
    public Circle(Point point, double radius) {
        this.point = point;
        this.radius = radius;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
