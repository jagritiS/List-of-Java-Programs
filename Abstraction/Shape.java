package Abstraction;

/**
 * Created by Jagriti on 9/24/2018.
 */
abstract class Shape {
    // declare fields
    String objectName = " ";

    Shape(String name)
    {
        this.objectName = name;
    }

    // declare non-abstract methods
    // it has default implementation
    public void moveTo(int x, int y)
    {
        System.out.println(this.objectName + " " + "has been moved to"
                + " x = " + x + " and y = " + y);
    }

    // abstract methods which will be
    // implemented by its subclass(es)
    abstract public double area();
    abstract public void draw();
}
