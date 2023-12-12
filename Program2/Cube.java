//***************************************************************
//
//  Developer:         Austin
//
//  Program #:         2
//
//  File Name:         Cube.java
//
//  Course:            COSC 4301 Modern Programming
//
//  Due Date:          6/17/23
//
//  Instructor:        Prof. Fred Kumi
//
//  Description:       Class Cube extends ThreeDimensionalShape,
//                     calculates area and volume of a cube given
//                     its edge
//
//***************************************************************
public class Cube extends ThreeDimensionalShape
{
    private double area; // holds cube area
    private double volume; // holds cube volume

    //***************************************************************
    //
    //  Method:       constructor
    //
    //  Description:  Cube constructor
    //
    //  Parameters:   double
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public Cube(double edge)
    {
        if(edge < 0.0)
        {
            throw new IllegalArgumentException(
                    "Edge must be >= 0.0");
        }

        area = 6 * Math.pow(edge, 2);
        volume = Math.pow(edge, 3);

    } // end constructor

    //***************************************************************
    //
    //  Method:       setAreaAndVolume
    //
    //  Description:  Method used to set attribute area and volume
    //
    //  Parameters:   double
    //
    //  Returns:      N/A
    //
    //  Note:        setting must be done in single method to avoid
    //               inaccurate data values
    //**************************************************************
    public void setAreaAndVolume(double edge)
    {
        if(edge < 0.0)
        {
            throw new IllegalArgumentException(
                    "Edge must be >= 0.0");
        }

        area = 6 * Math.pow(edge, 2);
        volume = Math.pow(edge, 3);

    } // end setAreaAndVolume

    //***************************************************************
    //
    //  Method:       getArea
    //
    //  Description:  Method used return area value
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
    //  Method:       getVolume
    //
    //  Description:  Method used return volume value
    //
    //  Parameters:   N/A
    //
    //  Returns:      double
    //
    //**************************************************************
    @Override
    public double getVolume()
    {
        return volume;

    } // end getVolume

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
        return String.format("Shape:     %s%nDimension: %s%nArea:      %.1f%nVolume:    %.1f%n",
                this.getClass().getName(), getType(), getArea(), getVolume());

    } // end toString

} // end class Cube
