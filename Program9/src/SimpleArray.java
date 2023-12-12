
import java.util.Arrays;
//********************************************************************
//
//  Developer:     Textbook Authors / Austin Riggs
//
//  Program #:     nine
//
//  File Name:     SimpleArray.java
//
//  Course:        ITSE 2317 Intermediate Java Programming
//
//  Due Date:      7/29/23
//
//  Instructor:    Fred Kumi
//
//  Chapter:       23
//
//  Description:   Modified version of SimpleArray.
//
//********************************************************************

public class SimpleArray
{
    private final int[] array; // the shared integer array
    private int writeIndex = 0; // index of next element to be written

    private long totalArray = 0; // holds sum of all array values


    //***************************************************************
    //
    //  Method:       constructor
    //
    //  Description:  creates a SimpleArray, size argument used
    //                to create int array of given size.
    //
    //  Parameters:   int
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public SimpleArray(int size)
    {
        array = new int[size];

    } // end constructor

    //***************************************************************
    //
    //  Method:       add
    //
    //  Description:  add is a synchronized method used add
    //                a new value to  the array. Each value passed
    //                to add is added to totalArray value.
    //
    //  Parameters:   int
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public synchronized void add(int value)
    {
        int position = writeIndex; // store the write index

        // put value in the appropriate element
        array[position] = value;

        // adds current value to sum of all integers in array
        totalArray += value;

        // increment index of element to be written next
        ++writeIndex;

    } // end add

    //***************************************************************
    //
    //  Method:       getTotal
    //
    //  Description:  returns value of totalArray
    //
    //  Parameters:   N/A
    //
    //  Returns:      long
    //
    //**************************************************************
    public long getTotal()
    {
        return totalArray;

    } // end getTotal

    //***************************************************************
    //
    //  Method:       toString
    //
    //  Description:  returns String of array contents
    //
    //  Parameters:   N/A
    //
    //  Returns:      String
    //
    //**************************************************************
    @Override
    public synchronized String toString()
    {
        return Arrays.toString(array);

    } // end toString

} // end class SimpleArray