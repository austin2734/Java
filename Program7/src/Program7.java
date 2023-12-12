//********************************************************************
//
//  Developer:     Instructor / Austin Riggs
//
//  Program #:     Seven
//
//  File Name:     Program7.java
//
//  Course:        ITSE 2317 Intermediate Java Programming
//
//  Due Date:      7/20/23
//
//  Instructor:    Fred Kumi
//
//  Chapter:       20
//
//  Description:   Printing array elements using generic
//                 method printArray.
//
//********************************************************************

public class Program7
{
    //***************************************************************
    //
    //  Method:       main
    //
    //  Description:  The main method of the program
    //
    //  Parameters:   String array
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public static void main(String[] args)
    {
        // create arrays of Integer, Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        // Single argument printArray used in following

        System.out.printf("Array integerArray contains: ");
        printArray(integerArray); // pass an Integer array

        System.out.printf("Array doubleArray contains: ");
        printArray(doubleArray); // pass a Double array

        System.out.printf("Array characterArray contains: ");
        printArray(characterArray); // pass a Character array

        // Overloaded printArray used in following

        System.out.printf("integerArray values between indexes 0 to 3 contains: ");
        printArray(integerArray, 0, 3);

        System.out.printf("doubleArray values between indexes 2 to 5 contains: ");
        printArray(doubleArray, 2, 5);

        System.out.printf("characterArray values between indexes 0 to 2 contains: ");
        printArray(characterArray, 0, 2);

        // Purposely throws InvalidSubscriptException

        System.out.printf("InvalidSubscriptException Test: ");
        printArray(integerArray, -1, 4);

    } // end main

    //***************************************************************
    //
    //  Method:       printArray
    //
    //  Description:  Generic method printArray
    //
    //  Parameters:   Generic array
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public static <T> void printArray(T[] inputArray)
    {
        // display array elements
        for (T element : inputArray)
        {
            System.out.printf("%s ", element);
        }

        System.out.println();



    } // end printArray

    //***************************************************************
    //
    //  Method:       printArray
    //
    //  Description:  Overloaded Generic method printArray
    //
    //  Parameters:   Generic array, int, int
    //
    //  Returns:      N/A
    //
    //**************************************************************

    public static <T> void printArray(T[] inputArray, int lowSubscript,
                                      int highSubscript)
    {
        try
        {
            // checks if subscript values are valid, throws exception if invalid
            if (lowSubscript < 0 || highSubscript > inputArray.length - 1)
            {
                throw new InvalidSubscriptException();
            }

            //  displays elements in array
            for (int i = lowSubscript; i <= highSubscript; i++)
            {
                System.out.printf("%s ", inputArray[i]);
            }

            System.out.println();


        }
        catch (InvalidSubscriptException e)
        {
            System.err.printf("%n%nError: Subscript values out of range.%n");
        }
        // to catch any other errors
        catch (Exception e)
        {
           System.err.printf("An error has occurred: %n%n%s%n%n", e);

        }


    } // end overloaded printArray

} // end Class Program7
