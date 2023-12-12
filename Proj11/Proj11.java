/*File Proj11.java
The purpose of this assignment is to assess the student's
ability to write a program dealing with arrays in general
and ragged arrays in particular.
***********************************************************/

// Student must not modify the code in this file. //

import java.util.Random;
import java.util.Date;
class Proj11{
  public static void main(String[] args){
    
    //Create a pseudo-random number generator
    Random generator = null;
    if(args.length != 0){
      generator = new Random(Long.parseLong(args[0]));
    }else{
      generator = new Random(new Date().getTime());
    };
    
    //Generate some small positive random numbers.
    int[] vals = {Math.abs((byte)generator.nextInt())%5+2,
                  Math.abs((byte)generator.nextInt())%5+2,
                  Math.abs((byte)generator.nextInt())%5+2};

    //Create an empty array object
    Object[][] array = new Object[3][];
    array[0] = new Object[vals[0]];
    array[1] = new Object[vals[1]];
    array[2] = new Object[vals[2]];

    //Instantiate an object from the student's code.
    Proj11Runner obj = new Proj11Runner();
    //Pass a reference to the empty array to the run method
    // of the object instantiated from the student's code
    // where the elements in the array object will be
    // populated with increasing Integer values.
    obj.run(array);

    //Display the data in the populated object.
    for(int i=0;i<3;i++){
      for(int j=0;j<vals[i];j++){
        System.out.print(((Object[])array[i])[j] + " ");
      }//end inner loop
      System.out.println();//new line
    }//end outer loop

    //Print some information that must descibe the
    // populated object.
    System.out.println();//blank line
    System.out.println("Row 0 width = " + vals[0]);
    System.out.println("Row 1 width = " + vals[1]);
    System.out.println("Row 2 width = " + vals[2]);
    System.out.println("Final value = " + (vals[0] + vals[1] + vals[2]));

    System.out.println("That's all folks.");

  }//end main
}//end class Proj11
//End program specifications.