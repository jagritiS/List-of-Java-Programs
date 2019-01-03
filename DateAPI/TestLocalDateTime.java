package DateAPI;

import java.time.*;

/**
 * Created by Jagriti on 9/28/2018.
 */
public class TestLocalDateTime {
    public static void main(String[] args) {
        // Get the current date and time using localDateTime
        LocalDateTime currentTime = LocalDateTime.now();
        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("Current DateTime: " + currentTime);
        System.out.println("date2: " + date2);

        //Using class localDate
        LocalDate date1 = currentTime.toLocalDate();
        LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
        System.out.println("date3: " + date3);
        System.out.println("date1: " + date1);

        LocalDate sampleLocDaB = LocalDate.of(2016, 07, 04);
        int year = sampleLocDaB.getYear();
        int dayOfMonth = sampleLocDaB.getDayOfMonth();
        Month month1 = sampleLocDaB.getMonth();
        int dayOfYear = sampleLocDaB.getDayOfYear();
        DayOfWeek dayOfWeek = sampleLocDaB.getDayOfWeek();
        int monthvalue = month1.getValue();
        System.out.println(sampleLocDaB);
        System.out.println(year+"==="+dayOfMonth+"=="+dayOfYear+"=="+dayOfWeek+"=="+monthvalue);


        //Using month
        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();
        System.out.println("Month: " + month +"day: " + day +"seconds: " + seconds);

        //22 hour 15 minutes
        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("date4: " + date4);

        //parse a string
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5: " + date5);
    }
}
