public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("Red", 3,4,5);
        Rectangle rectangle = new Rectangle("Blue",4,5);
        Circle circle = new Circle("Green", 2.5);
        Square square = new Square("Yellow", 4);

        Shape[] shapes = {triangle, rectangle, circle, square};

        for(Shape shape : shapes){
            System.out.println("Shape: " + shape.getClass().getSimpleName());
            System.out.println("Color: " + Shape.getColor());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();
        }
    }
}