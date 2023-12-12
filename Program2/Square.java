//***************************************************************
//
//  Developer:         Austin
//
//  Program #:         2
//
//  File Name:         Square.java
//
//  Course:            COSC 4301 Modern Programming
//
//  Due Date:          6/17/23
//
//  Instructor:        Prof. Fred Kumi
//
//  Description:       Class Square extends TwoDimensionalShape and
//                     calculates area of a square given its length
//
//***************************************************************
public class Square extends TwoDimensionalShape
{
    private double area; // area of square value

    //***************************************************************
    //
    //  Method:       constructor
    //
    //  Description:  Square constructor
    //
    //  Parameters:   double
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public Square(double length)
    {
        if(length < 0.0)
        {
            throw new IllegalArgumentException(
                    "Length must be >= 0.0");
        }

        area = Math.pow(length, 2);

    } // end constructor

    //***************************************************************
    //
    //  Method:       setArea
    //
    //  Description:  Method used to set attribute area
    //
    //  Parameters:   double
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public void setArea(double length)
    {
        if(length < 0.0)
        {
            throw new IllegalArgumentException(
                    "Length must be >= 0.0");
        }

        area = Math.pow(length, 2);

    } // end setArea

    //***************************************************************
    //
    //  Method:       getArea
    //
    //  Description:  Method used to return attribute area
    //
    //  Parameters:   N/A
    //
    //  Returns:      double
    //
    //**************************************************************
    @Override
    public double getArea()
    {
        return area;

    } // return getArea

    //***************************************************************
    //
    //  Method:       toString
    //
    //  Description:  returns customized String
    //
    //  Parameters:   N/A
    //
    //  Returns:      String
    //
    //**************************************************************
    @Override
    public String toString()
    {
        return String.format("Shape:     %s%nDimension: %s%nArea:      %.1f%n",
                this.getClass().getName(), getType(), getArea());

    } // end toString

} // end class Square
