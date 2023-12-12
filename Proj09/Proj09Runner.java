// Asg09
// Austin Riggs
// 04/17/23
// ITSE-2321-001

class Proj09Runner{
  
  byte valA;//Instance variable
  
  Proj09Runner(byte valA){//constructor
    
	this.valA = valA;
	
	//  student statement
	System.out.println(
	    "I certify that this program is my own work\n" +
        "and is not the work of others. I agree not\n" +
        "to share my solution with others.\n" +
	    "Austin Riggs\n");
	
  }
  // overriden toString method
  public String toString() { 
	
	return "Class Proj09Runner " + valA;
  
  } // end toString
  
  
  
} // end Proj09Runner

