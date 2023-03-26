package ro.sda.advanced._3_composition;

/* * Create a class named Dimensions with the following instance variables: width, height, depth
        * The class should contain getters for all the fields.*/
public class Dimensions {
    private double width;
    private double length;

    private double height;

    public Dimensions(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }
}
