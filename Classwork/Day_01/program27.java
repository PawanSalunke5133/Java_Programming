import java.util.Scanner;

class program27
{
    public static void main(String A[]) 
    {
        Scanner scanner = null;
        String sName=null;
        int iage=0;
        float fMarks=0.0; //Error

        scanner = new Scanner(System.in);

        System.out.println("Enter Your Name :");
        sName = scanner.next();

        System.out.println("Enter Your Age :");
        iage = scanner.nextInt();

        System.out.println("Enter Your Marks");
        fMarks = scanner.nextfloat();

        System.out.println("Welcome "+sName); 
        System.out.println("Your age "+iage);
        System.out.println("Your Marks "+fMarks);

    }
}