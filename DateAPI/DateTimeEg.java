package DateAPI;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/**
 * Created by Jagriti on 9/30/2018.
 */
public class DateTimeEg {
    public static void main(String[] args) {
        // Creates a new Clock instance based on UTC. …
         Clock defaultClock = Clock.systemUTC();
         System.out.println("Clock : " + defaultClock);
        // … // Creates a clock instance based on system clock zone
        Clock defaultClock2 = Clock.systemDefaultZone();
        System.out.println("Clock : " + defaultClock2);
    }
}
