package DateAPI;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Created by Jagriti on 10/1/2018.
 */
public class DateCalculationTwo {
    public static void main(String[] args) {
        String d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter current date in the format of year-month-day");
        d = sc.nextLine();
        System.out.println("Date entered is "+d);
        //converting String to Date
        LocalDate date = LocalDate.parse(d);
        System.out.println("date after parsing is  " + date);
        if(date.isAfter(LocalDate.now())){
            System.out.println("Date entered by user is greater");
        }else{
            System.out.println("Todays date is greater ");
        }
    }
}
