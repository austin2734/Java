//***************************************************************
//
//  Developer:         Austin
//
//  Program #:         2
//
//  File Name:         ThreeDimensionalShape.java
//
//  Course:            COSC 4301 Modern Programming
//
//  Due Date:          6/17/23
//
//  Instructor:        Prof. Fred Kumi
//
//  Description:       Abstract class ThreeDimensionalShape extends Shape,
//                     holds String attribute and contains getType method
//
//***************************************************************
public abstract class ThreeDimensionalShape extends Shape
{
    private final String TYPE = "Three-Dimensional"; // holds type of shape

    // abstract method
    public abstract double getArea();
    // abstract method
    public abstract double getVolume();

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

} // end ThreeDimensionalShape
