import java.util.*;
public class while_40
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if (n%7==0 || n%10==7)
        {
            System.out.print(n+" is a buzz number.");
        }
        else
        {
            System.out.print(n+" is not a buzz number.");
        }
    }
}