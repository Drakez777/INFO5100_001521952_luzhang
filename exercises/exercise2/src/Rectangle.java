public class Rectangle extends Shape{

    // Length and width of the rectangle
    private double length;
    private double width;

    // Constructor
    public Rectangle(){
        super("Blue");
    }


    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // Overriding abstract methods to calculate area and perimeter for a rectangle
    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}
