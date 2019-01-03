package variables;

public class Variables {
  // Defines instance variable
    int numTwo;
    String strOne;
    static  int staticVariable;

    public static void main (String [] args){
        //Creates method variable and the scope of this variable is limited to this method only
        int numOne = 10;
        //numTwo = 2; Instance variable can not be referenced from static context without static keyword
        staticVariable = 3; //static variable can be referenced from static context
        Variables varObj = new Variables();
        varObj.dispVar();
        //displaying value of method variable numOne
        System.out.println("The value of method variable numOne is " + numOne);
        //displaying the value of static or class variable
        System.out.println("The value of static variable is "+staticVariable);
    }
    public void dispVar(){
        numTwo = 2;
        strOne = "Hello I'm instance variable ";
        System.out.println("The value of instance variable numTwo is "+numTwo);
        System.out.println("The value of instance variable strOne is "+strOne);
    }
}

/*

Output of the Program
        The value of instance variable numTwo is 2
        The value of instance variable strOne is Hello I'm instance variable
        The value of method variable numOne is 10
        The value of static variable is 3

*/
