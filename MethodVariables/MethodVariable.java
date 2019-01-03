package MethodVariables;

import java.util.Scanner;

public class MethodVariable {
    public static void main(String[] args) {
        int a ,b;
        //creating object of the class MethodVariable
        MethodVariable mv  =  new MethodVariable();
        mv.display();
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Provid value for a ");
        a = sc.nextInt();
        System.out.println("Provide value for b");
        b = sc.nextInt();
        mv.sum(a,b);
    }
    public void display(){
        System.out.println("this is my display method ");
    }
    public int sum(int a, int b){
        System.out.println("the sum of a and b is "+(a+b));
        return (a+b);
    }
}
