import java.util.Scanner;
class program58
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
      
      //Input Filter 
      if(iNo <=0)
      {
        System.out.println("invalid input");
        return ;
      }
      for(iCnt=1; iCnt<=iNo; iCnt++)
      {
        System.out.println("Jay Ganesh..."); 
      }  
    }
}