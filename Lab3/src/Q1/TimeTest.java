// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: October 2022
// Purpose 			: Lab Exercise 3

package Q1;

public class TimeTest {

    public static void main (String args[])
    {
        Time t = new Time(23, 59, 59);

        // no second and no : in the return statement -> prints the setted time above together and without seconds and :
        System.out.println(t.toMilitaryString());
        // toString() prints the time as a string with : and AM/ PM
        System.out.println(t.toString());
        // t.tick() is needed to increment the time with 1 second and if 60 secounds -> increments minute
        // incrementMinute() method says that minutes increment by 1 and if 60 minutes -> increments hour by 1
        t.tick();
        // toMilitaryString() prints 0000 because increments by 1 and 2359 + 1 = 0000 (no seconds, no : )
        System.out.println(t.toMilitaryString());
        // prints toMilitaryString() in Military Time -> above 23:59:59 + 1 in PM time = now 12:00:00 AM
        System.out.println(t.toString());

        // following two lines to print Milliseconds and Seconds
        // -> time changes with every run because is real time since 01.01.1970
        System.out.println("Milliseconds: " + System.currentTimeMillis()); // prints Milliseconds
        System.out.println("Seconds: " + (System.currentTimeMillis()) / 1000); // prints Seconds


    }

}
