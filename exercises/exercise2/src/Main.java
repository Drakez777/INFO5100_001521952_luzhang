import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("Red", 3,4,5);
        Rectangle rectangle = new Rectangle("Blue",4,5);
        Circle circle = new Circle("Green", 2.5);
        Square square = new Square("Yellow", 4);

        Shape[] shapes = {triangle, rectangle, circle, square};

        for(Shape shape : shapes){
            System.out.println("Shape: " + shape.getClass().getSimpleName());
            System.out.println("Color: " + shape.getColor());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();
        }



//Triangle

        try{
            FileOutputStream fileOut_Triangle = new FileOutputStream("Triangle.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut_Triangle);
            out.writeObject(triangle);
            out.close();
            fileOut_Triangle.close();
        } catch(IOException i) {
            i.printStackTrace();
        }


        Triangle triangle2 = null;
        try{
            FileInputStream fileIn_Triangle = new FileInputStream("Triangle.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn_Triangle);
            triangle2 = (Triangle) in.readObject();
            in.close();
            fileIn_Triangle.close();
        } catch(IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c){
            c.printStackTrace();
            return;
        }
        System.out.println("Triangle");
        System.out.println("Area: " + triangle2.calculateArea() + "  Round: " + triangle2.calculatePerimeter());
        System.out.println();


//Circle
        try{
            FileOutputStream fileOut_Circle = new FileOutputStream("Circle.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut_Circle);
            out.writeObject(circle);
            out.close();
            fileOut_Circle.close();
        } catch(IOException i) {
            i.printStackTrace();
        }


        Circle circle2 = null;
        try{
            FileInputStream fileIn_Circle = new FileInputStream("Circle.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn_Circle);
            circle2 = (Circle) in.readObject();
            in.close();
            fileIn_Circle.close();
        } catch(IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c){
            c.printStackTrace();
            return;
        }
        System.out.println("Circle");
        System.out.println("Area: " + circle2.calculateArea() + "  Round: " + circle2.calculatePerimeter());        
        System.out.println();



//Rectangle        
        try{
            FileOutputStream fileOut_Rectangle  = new FileOutputStream("Rectangle.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut_Rectangle);
            out.writeObject(rectangle);
            out.close();
            fileOut_Rectangle.close();
        } catch(IOException i) {
            i.printStackTrace();
        }


        Rectangle rectangle2 = null;
        try{
            FileInputStream fileIn_Rectangle = new FileInputStream("Rectangle.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn_Rectangle);
            rectangle2 = (Rectangle) in.readObject();
            in.close();
            fileIn_Rectangle.close();
        } catch(IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c){
            c.printStackTrace();
            return;
        }
        System.out.println("Rectangle");
        System.out.println("Area: " + rectangle2.calculateArea() + "  Round: " + rectangle2.calculatePerimeter());        
        System.out.println();



//Square      
        try{
            FileOutputStream fileOut_Square  = new FileOutputStream("Square.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut_Square);
            out.writeObject(square);
            out.close();
            fileOut_Square.close();
        } catch(IOException i) {
            i.printStackTrace();
        }


        Square square2 = null;
        try{
            FileInputStream fileIn_Square = new FileInputStream("Square.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn_Square);
            square2 = (Square) in.readObject();
            in.close();
            fileIn_Square.close();
        } catch(IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c){
            c.printStackTrace();
            return;
        }
        System.out.println("Square");
        System.out.println("Area: " + square2.calculateArea() + "  Round: " + square2.calculatePerimeter());        
        System.out.println();        
    }
}