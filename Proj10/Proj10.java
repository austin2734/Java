/*File Proj10.java
The purpose of this assignment is to assess the student's
ability to write programs involving interfaces.

More specifically, the assignment requires the student
  to understand and to write programs that require the 
  following:
  Create interface definitions
  Implement interfaces in class definitions
  Store references to new objects in elements of an
    array of type Object
  Cast elements to interface types in order to
    invoke interface methods
  Define interface methods in class definition
  Override the toString method
***********************************************************/

// Student must not modify the code in this file. //

import java.util.*;

class Proj10{
  public static void main(String[] args){

    //Create a random number generator
    Random generator = null;
    if(args.length != 0){
      generator = new Random(Long.parseLong(args[0]));
    }else{
      generator = new Random(new Date().getTime());
    };
    
    //Get a random int value, cast it to type byte, save
    // in a variable of type int, and guaratee that the
    // value in the variable is positive.
    int randomData = (byte)generator.nextInt();
    if(randomData < 0){
      randomData = -randomData;
    }//end if

    //Create a two-element array of type Object
    Object[] var1 = new Object[2];

    //Populate the array with references to new objects
    var1[0] = new Proj10RunnerA(randomData);
    var1[1] = new Proj10RunnerB(randomData);

    //Display four lines of text on the screen.
    System.out.println("randomData = " + randomData);
    
    System.out.print(
             ((Proj10X)var1[0]).getModifiedData() + " ");
    System.out.print(randomData + " ");
    System.out.println(
                   ((Proj10X)var1[1]).getModifiedData());

    System.out.print(((Proj10X)var1[0]).getData() + " ");
    System.out.print(randomData + " ");
    System.out.println(((Proj10X)var1[1]).getData());

    System.out.print(((Proj10X)var1[0]) + " ");
    System.out.print(randomData + 5 + " ");
    System.out.println(((Proj10X)var1[1]));

  }//end main
}//end class Proj10
//End program specifications