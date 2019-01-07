package Assignments;

import java.math.BigInteger;

/**
 * Created by Jagriti on 1/7/2019.
 */
public class QNo7 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        long result = 0;
        long modulo = (long) 10000000000.0;

        for (int i = 1; i <= 1000; i++) {
            long temp = i;
            for (int j = 1; j < i; j++) {
                temp *= i;
                temp %= modulo;
            }
            result += temp;
            result %= modulo;
        }
        System.out.println(result);
    }
    //answer is 9110846700
}
