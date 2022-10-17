// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: October 2022
// Purpose 			: Lab Exercise 3

package Q1;

import java.util.Calendar;

public class Clock {
    public static void main(String[]args) {
        Calendar cal =  Calendar.getInstance();
        Time t = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));

        System.out.println(t.toString());

        long startTime = System.currentTimeMillis();
        long currentTime = startTime;
        int oldMin = cal.get(Calendar.MINUTE);
        int newMin = oldMin;

        while (newMin == oldMin) {
            while ((currentTime - startTime) < 1000) {
                currentTime = System.currentTimeMillis();
            }
            t.tick();
            System.out.println(t.toString());
            newMin = t.getMinute();
            startTime = System.currentTimeMillis();
            currentTime = startTime;
        }

        // write a loop that calls method tick() every second and then prints the
        // stored time. The loop (and program) should terminate (= stop) when the stored time
        // advances to the next minute
        // Hint: to find out when a second has passed you will need to use
        // System.currentTimeMillis()

    }

}
