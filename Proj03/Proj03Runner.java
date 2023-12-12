// Asg03
// Austin Riggs
// 01/23/23
// ITSE-2321-001

class Proj03Runner{

  static int run(int valIn){//receive value as type int
    //Print a required certification on the 
    // command-line screen.
    System.out.println(
      "I certify that this program is my own work \n"+
      "and is not the work of others. I agree not \n" +
      "to share my solution with others.\n" +
      "Austin Riggs\n");

    int myVar = valIn;//assign valIn to myVar
    System.out.println(myVar);//print it
    myVar++;//increment it
    return myVar;//return it
  }//end run

}//end class Proj03Runner