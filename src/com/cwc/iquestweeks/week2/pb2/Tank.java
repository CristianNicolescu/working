package com.cwc.iquestweeks.week2.pb2;

import java.util.ArrayList;
import java.util.List;

public class Tank {
    private List<Object> container;

    /**
     * Initializes container
     */
    public Tank() {
        container = new ArrayList<>();
    }

    /**
     * Adds an object to the container
     *
     * @param o Object to be added
     */
    public void add(Object o) {
        container.add(o);
    }

    /**
     * Removes last object added if possible
     */
    public void remove() {
        if (container.size() > 0)
            container.remove(container.size() - 1);
        else
            System.err.println("container is empty");
    }

    /**
     * Checks if container's size is 0
     *
     * @return
     */
    public boolean finalizeF() {
        if (container.size() == 0)
            return true;
        return false;
    }
}
