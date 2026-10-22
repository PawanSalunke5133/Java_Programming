import java.util.Scanner;
class program66
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
      int iCnt=0; //default value in int 
      iCnt=1; //starting 1 to 
      
      while (iCnt<=iNo) 
      {
        System.out.println("-------------"); 
        System.out.println(iCnt + " Jay Ganesh"); 
        System.out.println("-------------"); 

        iCnt++;
      }  
    }
}