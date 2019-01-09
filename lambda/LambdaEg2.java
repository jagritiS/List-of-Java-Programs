package lambda;

/**
 * Created by Jagriti on 1/8/2019.
 */

public class LambdaEg2 {
    interface NumericTest {
        boolean computeTest(int n);
    }
    interface MyGreeting {
        String processName(String str);
    }

    public static void main(String args[]) {
        NumericTest isEven = (n) -> (n % 2) == 0;
        NumericTest isNegative = (n) -> (n < 0);
        MyGreeting morningGreeting = (str) -> "Good Morning " + str + "!";
        MyGreeting eveningGreeting = (str) -> "Good Evening " + str + "!";
        //explicitly specify the type of the parameter in the expression
        MyGreeting moGreeting = (String str) -> "Good Morning " + str + "!";
        MyGreeting evGreeting = (String str) -> "Good Evening " + str + "!";

        // Output: false
        System.out.println(isEven.computeTest(5));

        // Output: true
        System.out.println(isNegative.computeTest(-5));

        // Output: Good Morning neons!
        System.out.println(morningGreeting.processName("neons"));

        // Output: Good Evening neo students!
        System.out.println(eveningGreeting.processName("neo students"));

        // Output: Good Morning neons!
        System.out.println(moGreeting.processName("frens"));

        // Output: Good Evening neo students!
        System.out.println(evGreeting.processName("fresn 2"));
    }

}

