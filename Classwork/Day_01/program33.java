///Approach 1
import java.util.Scanner;

class program33
{
    public static void main(String A[]) 
    {
        Scanner scanner = null;
        int ivalue1=0, ivalue2=0, iresult=0;

        scanner = new Scanner(System.in);

        System.out.println("Enter First No :");
        ivalue1 = scanner.nextInt();

        System.out.println("Enter Second No :");
        ivalue2 =scanner.nextInt();

        iresult=ivalue1+ivalue2;   //Business logic

        System.out.println("Addition is :"+iresult);

    }
}