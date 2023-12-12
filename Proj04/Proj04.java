/*File Proj04.java
The purpose of this assignment is to assess the student's
ability to write a program dealing with sequence, selection,
loop and simple arrays.
**********************************************************/

// Student must not modify the code in this file. //

import java.util.Random;
class Proj04{
  public static void main(String[] args){ //define main
    //User must enter two command-line arguments. Else
    // the program will throw an Index Out of Bounds error.
    // First argument is used as seed for random number
    // generator. Second argument specifies the number
    // of elements in the array.
    if(args.length != 2){
      //Print an error message and abort.
      System.out.println(
        "This program requires two command-line arguments.\n" +
        "Read the comments!");}
    else{
      //Create a random number generator
      Random generator = null;
  
      //Get first command-line argument. 
      // Convert it to a long integer, and use it as
      // the seed to create random number generator.
      // Each time the user runs the program with the
      // same command-line argument, the random number
      // generator will produce the same sequence of
      // random numbers.
      generator = new Random(Long.parseLong(args[0]));
  
      //Get second command-line argument and
      // use it to specify number of elements in the
      // array.
      int len = Integer.parseInt(args[1]);
      
      //Create an array object of type byte and populate
      // it with random values of type byte.
      System.out.println("Number of elements in array = " + len);
      byte[] byteArray = new byte[len];
      generator.nextBytes(byteArray);
  
      //Print the first andf last values in the array.
      System.out.println("First value in array = " + byteArray[0]);
      System.out.println("Last value in array = " + byteArray[len - 1]);
      System.out.println("\nStudent output text begins here.");
      
      //Pass the byteArray's reference to a static method
      // named run belonging to the student's class named
      // Proj04Runner. Store the return value in the variable
      // named average of type double.
      double average = Proj04Runner.run(byteArray);
      System.out.println("Student output text ends on previous line");
  
      //Print the value stored in the variable named average.
      System.out.println("Average value = " + average);
    }//end else
  }//end main
}//end class Proj04
//End program specifications