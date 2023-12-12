// Asg08
// Austin Riggs
// 04/08/23
// ITSE-2321-001

class Proj08Runner
{   
    // Proj08Runner constructor
	public Proj08Runner()
	{
		System.out.println(
		  "=======REQUIRED============\n" +
          "=======REQUIRED============\n" +
          "=======REQUIRED============");
	}
	
    // overloaded run method with String parameter
	String run(String cert)
	{
		
		return "I certify that this program is my own work\n" +
               "and is not the work of others. I agree not\n" +
               "to share my solution with others.";
						   
	}
	
	// overloaded run method with int and String parameters
	String run(int num, String name)
	{
		return "Austin Riggs \n";
		
	}
	
	// overloaded run method with int parameter
	byte run(int num)
	{
		return (byte)num;
	}
} // end class Proj07Runner