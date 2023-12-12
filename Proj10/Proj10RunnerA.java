// Asg10
// Austin Riggs
// 04/18/23
// ITSE-2321-001

class Proj10RunnerA implements Proj10X
{	
    // instance variable
	int data; 
	
	// class constructor
	public Proj10RunnerA(int num)
	{
		data = num;
		
		//  student statement
	    System.out.println(
	        "I certify that this program is my own work\n" +
            "and is not the work of others. I agree not\n" +
            "to share my solution with others.\n" +
	        "Austin\n" +
			"Riggs");
	}
	
	// interface Proj10X method defined, subtracts 1 from instance variable and returns
	public int getModifiedData()
	{
		return data - 1;
	}
	// interface Proj10X method defined, returns instance variable
	public int getData()
	{
		return data;
	}
	
	// overriding of toString method, adds 5 to instance variable and converts int to string
	public String toString()
	{
		return Integer.toString(data + 5);
	}
	
} // end of Proj10RunnerA