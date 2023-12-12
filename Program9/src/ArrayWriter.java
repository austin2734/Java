
import java.lang.Runnable;
import java.security.SecureRandom;

//********************************************************************
//
//  Developer:     Textbook Authors / Austin Riggs
//
//  Program #:     nine
//
//  File Name:     ArrayWriter.java
//
//  Course:        ITSE 2317 Intermediate Java Programming
//
//  Due Date:      7/29/23
//
//  Instructor:    Fred Kumi
//
//  Chapter:       23
//
//  Description:   Modified version of ArrayWriter. Used to write to
//                 SimpleArray object.
//
//********************************************************************

public class ArrayWriter implements Runnable
{
    // SimpleArray reference
    private final SimpleArray sharedSimpleArray;
    // number of writes to be made to sharedSimpleArray
    private final int numberOfWrites;
    // Used to generate random numbers to fill array with.
    private static final SecureRandom generator = new SecureRandom();


    //***************************************************************
    //
    //  Method:       constructor
    //
    //  Description:  creates ArrayWriter. Value is the number of
    //                writes ArrayWriter will make and array is the
    //                SimpleArray object to be written to.
    //
    //  Parameters:   int, SimpleArray
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public ArrayWriter(int value, SimpleArray array)
    {
        numberOfWrites = value;
        sharedSimpleArray = array;

    } // end constructor

    //***************************************************************
    //
    //  Method:       run
    //
    //  Description:  iterates up to given value of numberOfWrites
    //                to add random numbers between 1 to 20 to
    //                sharedSimpleArray
    //
    //  Parameters:   N/A
    //
    //  Returns:      N/A
    //
    //**************************************************************
    @Override
    public void run()
    {
        for (int i = 0; i < numberOfWrites; i++) {

            // add an element to the shared array
            sharedSimpleArray.add(generator.nextInt(20) + 1);
        }
    } // end run

} // end class ArrayWriter







