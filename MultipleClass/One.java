package MultipleClass;

/**
 * Created by Jagriti on 9/24/2018.
 */
public class One {

    //Instance variable strOne
    String strOne;

    //This method sets value that is contained in string s to instance variable strOne whenever it is called by the object of this class
    public void strValues(String s){
        strOne = s;
    }

    //Method to test whether the value contained in  strOne
    public void display(){

        System.out.println("The values are "+strOne);
    }
}
