package MethodObjects;

public class MethodsObjects {
    public static void main(String [] args){
        //Creates object of the class MethodsObjects with name objectOne
         MethodsObjects objectOne =  new MethodsObjects();

         //Calling display method with object of the class
        objectOne.display();
        objectOne.displayTwo();
        objectOne.displayNum();
        objectOne.displayThree(23);
    }
    //Creates method with public access and return type void
    public void display(){
        System.out.println("This is test for display method");
    }
    // Creating method displayTwo with return type String
    public String displayTwo(){
        System.out.println("Hello from method displayTwo ");
        return "This is String one ";
    }
    //Creating method displayNum with return type int
    public int displayNum(){
        System.out.println("Hello from method displayNum");
        return 1;
    }
    //Creating parameterised method
    public void displayThree(int a ){
        System.out.println("The value of a will be passed from object");
        System.out.println("The value of a is "+a);
    }
}

/*
Output of the program
      This is test for display method
      Hello from method displayTwo
      Hello from method displayNum
      The value of a will be passed from object
      The value of a is 23
*/
