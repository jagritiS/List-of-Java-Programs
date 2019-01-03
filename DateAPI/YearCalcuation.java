package DateAPI;

import java.sql.Time;
import java.time.Year;
import java.time.YearMonth;

/**
 * Created by Jagriti on 10/1/2018.
 */
public class YearCalcuation {

 public static void main(String[] args) {
     System.out.println(" The Present Year():"+ Year.now());

    System.out.println("The year 2002 is a Leap year :"+ Year.isLeap(2002));
    // to display whether the year 2002 is a leap // year or not
     System.out.println("The year 2012 is a Leap year :"+ Year.isLeap(2016));
    // to display whether the year 2012 is a leap year or not

     System.out.println("The Present Year Month:"+ YearMonth.now());
     // To display present year and month
      System.out.println("Month alone:"+YearMonth.parse("2016-04").getMonthValue());
     // To display only the month value
      System.out.println("Year alone:"+YearMonth.parse("2016-04" ).getYear());
     // to display the year value alone
     System.out.println("This year is a Leap year:" +YearMonth.parse("2016-04").isLeapYear());
     // leap year check

     }


}
