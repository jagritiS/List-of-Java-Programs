package constructors;

public class ConstrExample2 {
    int rollNum;
    String fName;
    String lName;

    //Creating constructor with one parameter
    public ConstrExample2(String fn){
        fName = fn;
    }
    //Creating constructor with two parameter
    public ConstrExample2(int r,String fn){
        rollNum = r;
        fName = fn;
    }
    //creating contstructor with three parameter
    public ConstrExample2(int r, String fn, String ln){
        rollNum = r;
        fName = fn;
        lName = ln;
    }
    //Displaying values
    public void display(){
        System.out.println("Roll No. : "+rollNum+" First name : "+fName+" Last Name :"+lName);
    }
    public static void main(String [] args){
        System.out.println("Hello");
        ConstrExample2 ce = new ConstrExample2("Test");
        ConstrExample2 ce1 = new ConstrExample2(10,"Test 2");
        ConstrExample2 ce2 = new ConstrExample2(10,"Test 3","neo");
        ce.display();
        ce1.display();
        ce2.display();
    }
}
