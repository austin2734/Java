//***************************************************************
//
//  Developer:         Austin
//
//  Program #:         2
//
//  File Name:         TwoDimensionalShape.java
//
//  Course:            COSC 4301 Modern Programming
//
//  Due Date:          6/17/23
//
//  Instructor:        Prof. Fred Kumi
//
//  Description:       Abstract class TwoDimensionalShape extends Shape,
//                     holds String attribute and contains getType method
//
//***************************************************************
public abstract class TwoDimensionalShape extends Shape
{
    private final String TYPE = "Two-Dimensional"; // holds type of shape

    // abstract method
    public abstract double getArea();

    //***************************************************************
    //
    //  Method:       getType
    //
    //  Description:  Method used to return TYPE value
    //
    //  Parameters:   N/A
    //
    //  Returns:      String
    //
    //**************************************************************
    public String getType()
    {
        return TYPE;

    } // end getType

} // end class TwoDimensional
