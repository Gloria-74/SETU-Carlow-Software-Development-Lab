// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: September 2022
// Purpose 			: Lab Exercise 1

public class ThermTest
{
    public static void main(String args[])
    {

        Thermometer thermA = new Thermometer();

        System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
        thermA.setCelsius(20.0);
        System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );

        Thermometer thermB = new Thermometer();

        thermB.setCelsius(10.0);

        Thermometer tempB = thermB;

        System.out.println("Temp. of Thermometer B is " + tempB.getCelsius());
    }
}