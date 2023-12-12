//********************************************************************
//
//  Developer:    Austin Riggs
//
//  Project #:    one
//
//  File Name:    PieceWorker.java
//
//  Course:       ITSE 2317 Intermediate Java Programming
//
//  Due Date:     6/11/2023
//
//  Instructor:   Prof. Fred Kumi
//
//  Description:  PieceWorker class extends Employee. Contains two private instance variables,
//                double wage and int pieces. Contains methods setWage(), setPieces(), getWage(), and
//                getPieces() as accessor and mutator methods for its instance variables.
//                PieceWorker overrides Employee methods earnings() and toString().
//
//
//********************************************************************

public class PieceWorker extends Employee  
{
	private double wage; // wage per hour
	private int pieces; // pieces produced

	//***************************************************************
	//
	//  Method:       constructor
	//
	//  Description:  class constructor
	//
	//  Parameters:   String, String, String, double, int
	//
	//  Returns:      N/A
	//
	//**************************************************************
	public PieceWorker(String firstName, String lastName,
		      String socialSecurityNumber, double wage, int pieces)
		   {
		      super(firstName, lastName, socialSecurityNumber);

			  // ensures value is not negative, will keep default value if negative
			   if(wage > 0.0)
				  {
					  this.wage = wage;
				  }

			   // ensures value is not negative, will keep default value if negative
			   if(pieces > 0)
			   {
				   this.pieces = pieces;
			   }



		   } // end constructor

	//***************************************************************
	//
	//  Method:       setWage
	//
	//  Description:  Method used to set wage
	//
	//  Parameters:   double
	//
	//  Returns:      N/A
	//
	//**************************************************************
   public void setWage(double wage)
   {
	   // ensures value is not negative, will keep default value if negative
	   if(wage > 0.0)
	   {
		   this.wage = wage;
	   }

   } // end setWage

	//***************************************************************
	//
	//  Method:       getWage
	//
	//  Description:  returns wage value
	//
	//  Parameters:   N/A
	//
	//  Returns:      double
	//
	//**************************************************************
   public double getWage()
   {
	   return wage;
   } // end getWage

	//***************************************************************
	//
	//  Method:       setPieces
	//
	//  Description:  Method used to set piece value
	//
	//  Parameters:   int
	//
	//  Returns:      N/A
	//
	//**************************************************************
   	public void setPieces(int pieces)
	{
		// ensures value is not negative, will keep default value if negative
		if(pieces > 0)
		{
			this.pieces = pieces;
		}

	} // end setPieces

	//***************************************************************
	//
	//  Method:       getPieces
	//
	//  Description:  returns pieces value
	//
	//  Parameters:   N/A
	//
	//  Returns:      int
	//
	//**************************************************************
	public int getPieces()
	{
		return pieces;
	} // end getPieces

	//***************************************************************
	//
	//  Method:       earnings
	//
	//  Description:  Override of Employee method earnings
	//
	//  Parameters:   N/A
	//
	//  Returns:      double
	//
	//**************************************************************
	@Override                                                           
	public double earnings()
	{
		return getWage() * getPieces();
	} // end earnings

	//***************************************************************
	//
	//  Method:       toString()
	//
	//  Description:  Overrides Employee method toString
	//
	//  Parameters:   N/A
	//
	//  Returns:      String
	//
	//**************************************************************
	@Override
	public String toString()
	{
		return String.format("piece worker employee: %s%n%s: $%,.2f; %s: %d",
		         super.toString(), "wage", getWage(),
		         "pieces produced", getPieces());
	} // end toString
		
	  

} // end class PieceWorker
