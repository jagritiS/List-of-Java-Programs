package Exceptions;

import java.util.Scanner;

/**
 * Created by Jagriti on 10/5/2018.
 */
public class ExceptionDemoTwo {

        public static void main(String[] args)
        {
            int a, b, ans=0;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter any two numbers: ");
            try
            {
                a=s.nextInt();
                b=s.nextInt();
                ans=a/b;
                System.out.println("Result: "+ans);
            }
            catch(ArithmeticException ae)
            {
                System.out.println("Denominator not be zero");
            }
            catch(Exception e)
            {
                System.out.println("Enter valid number");
            }
        }
}
