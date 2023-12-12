/*File Proj03.java
The purpose of this assignment is to assess the student's
ability to write a program dealing with methods, variables,
types, and operators.
**********************************************************/

// Student must not modify the code in this file. //

//Import the required class files from the library.
import java.util.Random;
import java.util.Date;
import java.lang.Math;

//Define the driver class. The code in this class controls
// the overall behavior of the program.
class Proj03{
  //Define the main method.
  public static void main(String[] args){ //define main
    //Create a random number generator using a seed based
    // on the current date and time.
    Random generator = new Random(new Date().getTime());
    //Get and save a random integer of type int. 
    int rand = generator.nextInt();
    
    //Cast the random integer down to type byte to limit
    // the maximum value and save the absolute value in
    // a variable of type int.
    int randomNumber = Math.abs((byte)rand);
    //Print the value of the random number.
    System.out.println(randomNumber);
    //Pass the value of the random number to a static 
    // method named run belonging to the student's class 
    // named Proj03Runner. Print the value returned by
    // the method named run.
    System.out.println(Proj03Runner.run(randomNumber));
  }//end main
}//end class Proj03
//End program specifications