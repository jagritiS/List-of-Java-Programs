package inheritance.simpleInheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sub sb = new Sub();
        sb.showMsgSub();
        sb.showMsgSuper();
        int a ;
        Scanner  sc =  new Scanner(System.in);
        System.out.println("Please Enter integer for days");
        a = sc.nextInt();
        switch(a){
            case 0 :
                System.out.println("Monday");
                break;
            case 1 :
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("wrong input");
                break;
        }
    }
}
