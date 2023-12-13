import java.io.Serializable;

abstract class Shape implements Serializable{
    String color;

    public Shape(String color) {
        this.color = color;
    }

    // Abstract methods for calculating area and perimeter
    abstract double calculateArea();

    abstract double calculatePerimeter();

    // Static method to get the color of the shape
    String getColor() {
        return color;
    }
}