package Overriding;

public class Reptiles extends Animal{
    public static void testClassMethod() {

        System.out.println("The static method in Reptile");
    }
    //this method overrides testInstanceMethod of Animal class
    public void testInstanceMethod() {
        System.out.println("The instance method in Reptile");
    }

    public static void main(String[] args) {
        Reptiles myReptile = new Reptiles();
        Animal myAnimal = myReptile;
        //invoking testClassMethod of Animal
        Animal.testClassMethod();
        //invoking testInstanceMethod from instance
        myAnimal.testInstanceMethod();
    }
}
