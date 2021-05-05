package com.agregation.dimension;

public class Dimension {

    public int height;
    public int width;
    public int trunkCapacity;

    public Dimension(int height, int width, int trunkCapacity) {
        this.height = height;
        this.width = width;
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "height=" + height +
                ", width=" + width +
                ", trunkCapacity=" + trunkCapacity +
                '}';
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getTrunkCapacity() { return trunkCapacity; }

    public void setTrunkCapacity(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

}
