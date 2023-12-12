//***************************************************************
//
//  Developer:         Austin
//
//  Program #:         2
//
//  File Name:         Sphere.java
//
//  Course:            COSC 4301 Modern Programming
//
//  Due Date:          6/17/23
//
//  Instructor:        Prof. Fred Kumi
//
//  Description:       Class Sphere extends ThreeDimensionalShape,
//                     calculates area and volume of a Sphere given
//                     its radius
//
//***************************************************************
public class Sphere extends ThreeDimensionalShape
{
    private double area; // holds area of sphere
    private double volume; // holds volume of sphere

    //***************************************************************
    //
    //  Method:       constructor
    //
    //  Description:  Sphere constructor
    //
    //  Parameters:   double
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public Sphere(double radius)
    {
        if(radius < 0.0)
        {
            throw new IllegalArgumentException(
                    "Radius must be >= 0.0");
        }

        area = 4 * PI * (Math.pow(radius, 2));
        volume = (4.0/3.0) * PI * (Math.pow(radius, 3));

    } // end of constructor

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
    public void setAreaAndVolume(double radius)
    {
        if(radius < 0.0)
        {
            throw new IllegalArgumentException(
                    "Radius must be >= 0.0");
        }

        area = 4 * PI * (Math.pow(radius, 2));
        volume = (4.0/3.0) * PI * (Math.pow(radius, 3));


    } // end setArea

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

} // end class Sphere
