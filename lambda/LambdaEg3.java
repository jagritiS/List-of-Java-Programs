package lambda;

/**
 * Created by Jagriti on 1/8/2019.
 */
public class LambdaEg3 {
    public static void main(String[] args) {
        long result = 0;
        long modulo = (long) 10000000000.0;

        for (int i = 1; i <= 1000; i++) {
            long temp = i;
            for (int j = 1; j < i; j++) {
                temp *= i;
                System.out.println("chec1 "+temp);
                temp %= modulo;
                System.out.println("check 2"+temp);
            }
            result += temp;
            result %= modulo;
        }
        System.out.println(result);
    }
}
