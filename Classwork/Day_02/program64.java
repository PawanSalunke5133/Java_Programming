class program64
{
 
    public static void main(String A[]) 
    {
      Iteration iteration = new Iteration(); //object

      iteration.Display(); 
    }
}
class Iteration
{
    public void Display()
    {
      int iCnt=0;
           
      for(iCnt=6; iCnt >=1; iCnt--)  
      {
        System.out.println("Jay Ganesh..."); 
      }  
    }
}