package DateAPI;

/**
 * Created by Jagriti on 10/1/2018.
 */
import java.time.LocalDate;
// Class to get the present day
import java.time.Month;
// Class to get month related calculations
 import java.time.Period;
 //Class to calculate the time period between two
 // time instances
 import java.time.temporal.ChronoUnit;
public class NextBDay {
public static void main(String[] args)
{ LocalDate presentday = LocalDate.now();
    LocalDate bday = LocalDate.of(2015, Month.MAY, 22);
    //localDate withYear(int year) returns a copy of this date with the year altered. and getYear gives year
    LocalDate comingBDay = bday.withYear(presentday.getYear());
     // To address the belated b'day celebration.
     if (comingBDay.isBefore(presentday) || comingBDay.isEqual(presentday))
     { comingBDay = comingBDay.plusYears(1); }
    Period waitA = Period.between(presentday, comingBDay);
    long waitB = ChronoUnit.DAYS.between(presentday, comingBDay);

    System.out.println("Totally, I need to wait for " + waitA.getMonths() + " months, and " + waitA.getDays() + " days to celebrate my next B'day. (" + waitB + " days in total)");
    // to display the waiting time for B'day Bash

}}
