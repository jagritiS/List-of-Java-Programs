package constructors;

public class ConstrExample {
    int numOne;
    String strOne;
    //creating default constructor
    public ConstrExample(){
        System.out.println("The default value of numOne is "+numOne);
        System.out.println("The default value of strOne is "+strOne);
    }

   //Creating parameterised constructor
    public ConstrExample(int n,String s){
        numOne = n;
        strOne = s;
    }
    //Method to display values
    public void display(){
        System.out.println("The value of numOne is "+numOne);
        System.out.println("The value of strOne is "+strOne);
    }
    public  static void main(String [] args){
        //Calling default constructor
        ConstrExample ce = new ConstrExample();
        ConstrExample ce1 = new ConstrExample(10,"hello");
        ce1.display();
    }
}
