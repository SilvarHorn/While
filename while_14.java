import java.util.*;
public class while_14
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int f=0;
        for (int x=1;x<n;x++)
        {
            if (n%x == 0)
            {
                f+=x;
            }
        }
        if (f==n)
        {
            System.out.print(n+" is a perfect number.");
        }
        else
        {
            System.out.print(n+" is not a perfect number.");
        }
    }
}