// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: October 2022
// Purpose 			: Lab Exercise 3

package Q1;

import java.util.Calendar;

public class Clock {
    Calendar cal =  Calendar.getInstance();
    Time t = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));

    private int hour;        // 0 - 23
    private int minute;      // 0 - 59
    private int second;      // 0 - 59
    private int millisecond; // 0 - 1000

    //t.tick();

    // write a loop that calls method tick() every second and then prints the
    // stored time. The loop (and program) should terminate (= stop) when the stored time
    // advances to the next minute
    // Hint: to find out when a second has passed you will need to use
    // System.currentTimeMillis()


    public void setT(Time t) {
        for (millisecond = 0; millisecond < 1000;) {
            t.tick();
            System.out.println(t);
        }

    }
}
