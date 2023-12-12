// Asg10
// Austin Riggs
// 04/18/23
// ITSE-2321-001

class Proj10RunnerB implements Proj10X
{
	// instance variable
	int data;
	
	// class constructor
	public Proj10RunnerB(int num)
	{
		data = num;
	}
	
    // interface Proj10X method defined, adds 1 to instance variable and returns
	public int getModifiedData()
	{
		return data + 1;
	}
	// interface Proj10X method defined, returns instance variable
	public int getData()
	{
		return data;
	}
	
	// overrides toString method
	public String toString()
	{
		return Integer.toString(data + 5);
	}
	
} // end of Proj10RunnerB