package MultipleClass;

/**
 * Created by Jagriti on 9/24/2018.
 */
public class MainClass {
    public static void main(String[] args) {
        //Creating object of  class named One
        One objOne = new One();

        //fetch method strValues of class named One  in another class names  MainClass with object of One
        objOne.strValues("This is string One");

        //Creating object of  class named Two
        Two objTwo = new Two();

        //Fetching parameterised method values from class named Two with object of that class
        objTwo.values(12);

        //Referencing public instance variable of class named Two with object of that class
        objTwo.numTwo = 13;

        //Printing the value of numOne
        System.out.println("The value of numOne is "+objTwo.numOne);

        //Printing the value of numTwo
        System.out.println("The value of numTwo is "+objTwo.numTwo);

        //Calling method display of class named One with object of that class
        objOne.display();

    }
}
/*

Output of the program
        The value of numOne is 12
        The value of numTwo is 13
        The values are This is string One
*/
