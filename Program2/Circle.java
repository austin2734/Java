//***************************************************************
//
//  Developer:         Austin
//
//  Program #:         2
//
//  File Name:         Circle.java
//
//  Course:            COSC 4301 Modern Programming
//
//  Due Date:          6/17/23
//
//  Instructor:        Prof. Fred Kumi
//
//  Description:       Class Circle extends TwoDimensionalShape and
//                     calculates area of a circle given its radius
//
//***************************************************************

public class Circle extends TwoDimensionalShape
{
    private double area; // area of circle value

    //***************************************************************
    //
    //  Method:       constructor
    //
    //  Description:  Circle constructor
    //
    //  Parameters:   double
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public Circle(double radius)
    {
        if(radius < 0.0)
        {
            throw new IllegalArgumentException(
                    "Radius must be >= 0.0");
        }

        area = PI * Math.pow(radius, 2);

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
    public void setArea(double radius)
    {
        if(radius < 0.0)
        {
            throw new IllegalArgumentException(
                    "Radius must be >= 0.0");
        }

        area = PI * Math.pow(radius, 2);

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

    } // end getArea

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

} // end class Circle
