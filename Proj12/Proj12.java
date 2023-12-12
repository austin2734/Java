/*File Proj12.java
The purpose of this assignment is to assess the student's
ability to write a program dealing with the this and
super keywords.
***********************************************************/

// Student must not modify the code in this file. //

import java.util.Random;
import java.util.Date;

class Proj12{
  public static void main(String[] args){
    
    //Create a pseudo-random number generator
    Random generator = null;
    if(args.length != 0){
      generator = new Random(Long.parseLong(args[0]));
    }else{
      generator = new Random(new Date().getTime());
    };
    
    //Get a random number of type int. Cast it down to
    // type byte simply to reduce the maximum value.
    // Store it in a variable named valA of type byte.
    // Display it.
    byte valA = (byte)(generator.nextInt());
    System.out.println("Random byte value = " + valA);

    Proj12Runner obj = new Proj12Runner( 
      "I certify that this program is my own work \n"+
      "and is not the work of others. I agree not \n" +
      "to share my solution with others.\n" + valA);

    System.out.println(obj.run("Hello World"));
    
System.out.println(
"Reminder\n" +
"Student must rename Proj12Skeleton.txt to\n" +
"Proj12Runner.java.\n" +
"Then student must update Proj12Runner.java by:\n" +
"1. Inserting his or her name where indicated.\n" +
"2. Modifying ONLY ONE other physical line of code.\n" +
"DO NOT add any new lines of code.");
    

  }//end main
}//end class Proj12
//End program specifications.