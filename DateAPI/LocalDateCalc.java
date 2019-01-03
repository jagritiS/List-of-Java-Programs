package DateAPI;

import java.time.LocalDate;

/**
 * Created by Jagriti on 10/1/2018.
 */
public class LocalDateCalc {
    public static void main(String[] args) {
        LocalDate sampleLocDa = LocalDate.of(2016, 04, 30);
        LocalDate sampleLocDaA = sampleLocDa.plusYears(4);
        LocalDate sampleLocDaB = sampleLocDa.minusYears(4);
        System.out.println(sampleLocDa+"===plus 4 years "+sampleLocDaA+"==minus 4 years=="+sampleLocDaB);

    }
}
