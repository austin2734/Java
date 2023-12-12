//***************************************************************
//
//  Developer:         Austin
//
//  Program #:         2
//
//  File Name:         Triangle.java
//
//  Course:            COSC 4301 Modern Programming
//
//  Due Date:          6/17/23
//
//  Instructor:        Prof. Fred Kumi
//
//  Description:       Class Triangle extends TwoDimensionalShape and
//                     calculates area of a triangle given its base and height
//
//***************************************************************
public class Triangle extends TwoDimensionalShape
{
    private double area; // holds triangle area value

    //***************************************************************
    //
    //  Method:       constructor
    //
    //  Description:  Triangle constructor
    //
    //  Parameters:   double, double
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public Triangle(double base, double height)
    {
        if(base < 0.0 || height < 0.0)
        {
            throw new IllegalArgumentException(
                    "Base and height must be >= 0.0");
        }

        area = .5 * base * height;

    } // end constructor

    //***************************************************************
    //
    //  Method:       setArea
    //
    //  Description:  Method used to set attribute area
    //
    //  Parameters:   double, double
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public void setArea(double base, double height)
    {
        if(base < 0.0 || height < 0.0)
        {
            throw new IllegalArgumentException(
                    "Base and height must be >= 0.0");
        }

        area = .5 * base * height;

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

} // end class Triangle
