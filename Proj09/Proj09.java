/*File Proj09.java
The purpose of this assignment is to assess the student's
ability to write a program dealing with overridden methods
and runtime polymorphism.
***********************************************************/

// Student must not modify the code in this file. //

import java.util.Random;
import java.util.Date;
class Proj09{
  public static void main(String[] args){
    
    //Create a random number generator
    Random generator = null;
    if(args.length != 0){
      generator = new Random(Long.parseLong(args[0]));
    }else{
      generator = new Random(new Date().getTime());
    };
    
    //Get and save random number of type byte.
    byte valA = (byte)generator.nextInt();
    
    //Instantiate an object from the student's code. Save
    // the reference as type Object
    Object obj = new Proj09Runner(valA);
    
    System.out.println("Random value = " + valA);
    System.out.println(obj);//think overridden toString
    System.out.println("That's all folks.");

  }//end main
}//end class Proj09
//End program specifications.