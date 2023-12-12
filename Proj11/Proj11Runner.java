// Asg11
// Austin Riggs
// 04/25/23
// ITSE-2321-001

class Proj11Runner
{	
    
	// class constructor
	public Proj11Runner()
	{
		
		//  student statement
	    System.out.println(
	        "I certify that this program is my own work\n" +
            "and is not the work of others. I agree not\n" +
            "to share my solution with others.\n" +
	        "Austin Riggs\n");
	}
	// method used to fill array objec with integer values
	// first value is 1 and increments by 1 up to total sum of array row lengths
	public void run( Object[][] arr )
	{   
	   int elementCount = 0;
		
		for (int i=0; i < arr.length; i++)
		{
			for (int j=0; j < arr[i].length; j++)
			{	
		        elementCount++;
				
				arr[i][j] = elementCount;
			}
		} 
	} // end run method
	
} // end Proj11Runner	
	