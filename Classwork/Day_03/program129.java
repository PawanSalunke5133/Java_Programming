import java.util.Scanner;

class Digit
{
    public int SumDigits(int iNo) // funtion 
    {
        int iSum = 0; // variable

        if(iNo < 0) 
        {
            iNo = -iNo;
        }

        while(iNo != 0) //loop
        {
            iSum = iSum + (iNo % 10);
            iNo = iNo / 10;                 
        }

        return iSum;
    }
}

class program129
{
    public static void main(String A[]) // main function 
    {
        Scanner scanner = new Scanner(System.in); //scanner cha object
        int iRet = 0;  // variable
        Digit digit = new Digit(); // object
        
        System.out.println("Enter number : ");
        int iValue = scanner.nextInt(); 

        iRet = digit.SumDigits(iValue);

        System.out.println("Summation of digits : "+iRet);
    }
}