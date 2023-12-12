/*File Proj08.java
The purpose of this assignment is to assess the student's
ability to write a program dealing with overloaded methods
and assignment compatibility.
Updated 01/20/23 to correct a misspelling of the
word certification in a call to the run method.
***********************************************************/

// Student must not modify the code in this file. //

import java.util.Random;
import java.util.Date;
class Proj08{
  public static void main(String[] args){
    //Create a pseudo-random number generator
    Random generator = null;
    if(args.length != 0){
      generator = new Random(Long.parseLong(args[0]));
    }else{
      generator = new Random(new Date().getTime());
    };
    
    //Get and save positive random number of type int.
    int valA = Math.abs((generator.nextInt()))/67000 + 1024;
    
    //Instantiate an object from the student's code. Save
    // the reference as the type of the class.
    Proj08Runner obj = new Proj08Runner();

    //Call the run method three times in succession on the
    // object whose reference is stored in the variable
    // named obj. Pass a different argument list to the
    // run method each time it is called. Save the returned
    // values each time the run method is called.
    String valB = obj.run("certification");
    String valC = obj.run(1,"name");
    byte valD =   obj.run(valA);

    //Print the original random integer
    System.out.println(valA);
    
    //Print the three values returned from the three calls
    // to the run method.
    System.out.println(valB);
    System.out.println(valC);
    System.out.println(valD);
    
    //Print the original random integer after casting it
    // down to type byte.
    System.out.println((byte)valA);

  }//end main
}//end class Proj08
//End program specifications.