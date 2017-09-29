package com.cwc.iquestweeks.week3.pb3;


import java.util.ArrayList;
import java.util.List;

public class Canvas {
    List<Rectangle> rectangles;
    List<Circle> circles;
    List<Canvas> subCanvases;

    /**
     * Initializes the containers for rectangles and circles
     */
    public Canvas() {
        rectangles = new ArrayList<>();
        circles = new ArrayList<>();
    }

    /**
     * Canvases that are included inside this canvas
     */
    public List<Canvas> getSubCanvases() {
        return subCanvases;
    }

    public void setSubCanvases(List<Canvas> subCanvases) {
        this.subCanvases = subCanvases;
    }

    public List<Rectangle> getRectangles() {
        return rectangles;
    }

    public void setRectangles(List<Rectangle> rectangles) {
        this.rectangles = rectangles;
    }

    public List<Circle> getCircles() {
        return circles;
    }

    public void setCircles(List<Circle> circles) {
        this.circles = circles;
    }
}
