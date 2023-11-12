abstract class Shape {
    static String color;

    public Shape(String color) {
        this.color = color;
    }

    // Abstract methods for calculating area and perimeter
    abstract double calculateArea();

    abstract double calculatePerimeter();

    // Static method to get the color of the shape
    static String getColor() {
        return color;
    }
}