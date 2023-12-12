// Asg04
// Austin Riggs
// 03/05/23
// ITSE-2321-001

class Proj04Runner{

  static double run(byte[] byteArray){
    //Print a required certification on the 
    // command-line screen.
    System.out.println(
      "I certify that this program is my own work \n"+
      "and is not the work of others. I agree not \n" +
      "to share my solution with others.\n" +
      "Austin Riggs\n");

    //Insert code to get and display the length of the array
	
	int arrLength = byteArray.length; // stores length of the array to be used later in program 
	System.out.println("Array length = " + arrLength); // prints array length to user


    //Insert code to get and display the value in the 
    // last element in the array.
	
	byte lastElement = byteArray[arrLength - 1];  // stores last element in array
	System.out.println("Value in last element = " + lastElement); // prints last element of array to user

    //Insert code to determine and display whether the
    // last element in the array is odd or even.
	
	String evenOrOdd; // String variable to hold either "odd" or "even".
	if (lastElement % 2 == 0) // number is even
		evenOrOdd = "Even";
	else                     // number is odd
		evenOrOdd = "Odd";
	
	System.out.println("The value in the last element is " + evenOrOdd); // prints statement with even or odd to user
		
	
    
    double sum = 0;    
    //Insert code to compute and display the sum of all the
    // values stored in the array as type double. Include
    // code that will display the beginning and ending
    // indices.
	for (int i = 0; i < arrLength; i++) // iterates through entire array 
	{
		if (i == 0) // first index of array
			System.out.println("Begin loop at index = " + i);
		else if (i == arrLength - 1) // last index of array
			System.out.println("End loop at index = " + i);
		
		sum += byteArray[i]; // adds all numbers in array to variable sum
	}
	
	System.out.println("The sum is " + sum); // prints array sum to user

    
    double avg = 9999;
    //Insert code to compute and display the average of all
    // the values in the array.
	
	avg = sum / arrLength; // calculates average of array
	
	System.out.println("The average is " + avg); // prints array average to user

    return avg;

  }//end run method

}//end class Proj04Runner