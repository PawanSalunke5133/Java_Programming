import java.util.Scanner;
class program61
{
 
    public static void main(String A[]) 
    {
      Scanner scanner = new Scanner(System.in); //object scanner
      int ivalue = 0;
      
      Iteration iteration = new Iteration(); //object below class

      System.out.println("Enter the Frequency :");
      ivalue = scanner.nextInt();

      iteration.Display(ivalue); 
    }
}
class Iteration
{
    public void Display(int iNo)
    {
      int iCnt=0;
      
      for(iCnt=1; iCnt<=iNo; iCnt++)
      {
        System.out.println("-------------"); //static
        System.out.println(iCnt); ///Dynamic
        System.out.println("-------------"); //static
      }  
    }
}