///Approach 2
import java.util.Scanner;

class program35
{
    public static int Addition(int iNo1, int iNo2)
    {
        int iAns=0;
        iAns = iNo1 + iNo2;
        return iAns;
    }

    public static void main(String A[]) 
    {
        Scanner scanner = null;
        int ivalue1=0, ivalue2=0, iresult=0;

        scanner = new Scanner(System.in);

        System.out.println("Enter First No :");
        ivalue1 = scanner.nextInt();

        System.out.println("Enter Second No :");
        ivalue2 =scanner.nextInt();

        iresult =Addition(ivalue1, ivalue2); 

        System.out.println("Addition is :"+iresult);

    }
}