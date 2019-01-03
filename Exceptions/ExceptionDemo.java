package Exceptions;

/**
 * Created by Jagriti on 10/5/2018.
 */
public class ExceptionDemo {
    public static void main(String[] args)
    {
        int a=10, ans=0;
        try
        {
            ans=a/0;
        }
        catch (Exception e)
        {
            System.out.println("Denominator not be zero");
        }
    }
}
