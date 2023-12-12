/*File Proj07.java
The purpose of this assignment is to assess the student's
ability to write a program dealing with constructors and
overridden methods.
***********************************************************/

// Student must not modify the code in this file. //

class Proj07{
  public static void main(String[] args){
    //Instantiate a new object of the student's class named
    // Proj07Runner. Store the object's reference in a
    // variable named obj of type Proj07.Note the 
    // difference in the type of the object and the type
    // of the variable (think inheritance).
    Proj07 obj = new Proj07Runner();
    System.out.println("\n========Required=======\n");
    System.out.println("Call the method named run.");
    
    //Call the instance method named run belonging to
    // the object whose reference is stored in the 
    // variable named obj.
    obj.run();
    
    //Instantiate a new object of the class named Proj07.
    // Store the object's reference in the variabler named
    // obj, overwriting the reference that was previously
    // stored there.
    obj = new Proj07();
    //Call the instance method named run belonging to
    // the object whose reference is stored in the 
    // variable named obj.
    obj.run();
  }//end main
  //----------------------------------------------------//
  void run(){
    System.out.println("Hello World");
  }//end run
}//end class Proj07
//End program specifications.