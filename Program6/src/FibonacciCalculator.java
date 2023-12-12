import java.math.BigInteger;

//*****************************************************************
//
//  Developer:     Austin Riggs / Authors of Java: How to Program.
//
//  Program #:     Six
//
//  File Name:     FibonacciCalculator.java
//
//  Course:        ITSE 2317 Java Programming (Intermediate)
//
//  Due Date:      7/15/23
//
//  Instructor:    Prof. Fred Kumi
//
//  Chapter:       18
//
//  Description:   Class FibonacciCalculator, calculates
//                 fibonacci numbers between zero to forty. Class
//                 also calculates number of function calls to
//                 method "fibonacci" and duration of time taken
//                 to complete calculations in milliseconds.
//
//
//******************************************************************
public class FibonacciCalculator
{
    // constant variable that holds value of two
    private BigInteger TWO = BigInteger.valueOf(2);

    // used to keep track of function calls make to fibonacci method
    private long numberOfCalls;

    // default constructor used

    //***************************************************************
    //
    //  Method:       fibonacci
    //
    //  Description:  Recursive function used to calculate given
    //                fibonacci number.
    //
    //  Parameters:   BigInteger
    //
    //  Returns:      BigInteger
    //
    //**************************************************************
    private BigInteger fibonacci(BigInteger number)
    {
        numberOfCalls++;

        // base cases
        if (number.equals(BigInteger.ZERO) ||
                number.equals(BigInteger.ONE))
        {
            return number;
        }
        // recursion step
        else
        {
            return fibonacci(number.subtract(BigInteger.ONE)).add(
                    fibonacci(number.subtract(TWO)));
        }
    } // end fibonacci

    //***************************************************************
    //
    //  Method:       startCalculator
    //
    //  Description:  starts calculations of fibonacci numbers
    //                between zero to forty. Time taken at start
    //                and end of for loop to calculate total duration.
    //                Prints fibonacci numbers, duration, and
    //                total fibonacci function calls to user.
    //
    //  Parameters:   N/A
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public void startCalculator()
    {
        long startTime; // stores start time
        long stopTime; // stores stop time
        long duration; // used to calculate total duration

        // start time saved to variable
        startTime = System.currentTimeMillis();

        // displays the fibonacci values to given iteration value
        for (int counter = 0; counter <= 40; counter++)
        {
            System.out.printf("Fibonacci of %d is: %d%n", counter,
                    fibonacci(BigInteger.valueOf(counter)));
        }

        // stop time saved to variable
        stopTime = System.currentTimeMillis();

        // duration calculated
        duration = stopTime - startTime;

        System.out.printf("%n%nTotal Duration in Milliseconds:   %d%nTotal " +
                "Fibonacci Calls:  %d%n",duration, numberOfCalls);

    } // end startCalculator

} // end Class FibonacciCalculator

