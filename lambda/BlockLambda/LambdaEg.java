package lambda.BlockLambda;

/**
 * Created by Jagriti on 1/14/2019.
 */
public class LambdaEg {
    interface MyString {
        String myStringFunction(String str);
    }
    public interface MyPrinter{
        public void print(String s);
    }

    public static void main(String[] argv) { // To retrieve result with a lambda expression
        // Block lambda to reverse string
        MyString reverseStr = (str) -> {
            String result = "";

            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };
       // MyPrinter myPrinter1 = (s) -> { System.out.println(s); };
       // MyPrinter myPrinter2 = s -> System.out.println(s);
       // MyPrinter myPrinter = System.out::println;


        // Output: omeD adbmaL
        System.out.println(reverseStr.myStringFunction("Lambda Demo"));

    }

}

