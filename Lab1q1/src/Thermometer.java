// Implements a Thermometer class.
// Stores the current temperature in Celcius

// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: September 2022
// Purpose 			: Lab Exercise 1

public class Thermometer
{
    private double celsius;

    public Thermometer()			// constructor method #1
    {
        setCelsius(0);
    }

    public Thermometer(double cel)	// constructor method #2
    {
        setCelsius(cel);
    }

    public void setCelsius(double cel)
    {
        celsius = cel;
    }

    public double getCelsius()
    {
        return celsius;
    }
}

// an empty constructor (without parameters) is automatically implied by the compiler.
// the second constructor contains a parameter (double cel) which is there to find out the temperature via the ID.