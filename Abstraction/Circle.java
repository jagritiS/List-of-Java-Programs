package Abstraction;

/**
 * Created by Jagriti on 9/24/2018.
 */
public class Circle extends Shape {

    double pi = 3.14;
    int radius;

    //constructor
    Circle(int radius, String name) {

        super(name);
        this.radius = radius;
    }

    @Override
    public void draw() {

        System.out.println("Circle has been drawn ");
    }

    @Override
    public double area() {
        return (double) ((pi * radius * radius) / 2);
    }
}