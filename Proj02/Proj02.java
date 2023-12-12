// Asg02
// Austin Riggs
// 01/17/23
// ITSE-2321-001

class Proj02
{
  public static void main(String[] args)
  {
    System.out.println("I certify that this program is my own work");
    System.out.println("and is not the work of others. I agree not");
    System.out.println("to share my solution with others.");
    System.out.println("Austin Riggs\n");
    
    if (args.length > 0)
    {
      int argSum = 0;
      
      for (int i = 0; i < args.length; i++)
      {
        System.out.println(args[i]);
        argSum += Integer.parseInt(args[i]);
      }
      
      System.out.println(argSum);
    
    }
    
  } // end main method
  
}// end class