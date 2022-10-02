import java.util.*;
public class while_17
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int d=0,f=1,s=0,n1=n;
        while (n>0)
        {
            d=n%10;
            for (int x=1;x<=d;x++)
            {
                f*=x;
            }
            s+=f;
            n/=10;
            f=1;
        }
        if (s==n1)
        {
            System.out.print(n1+" is a krishanamurty number.");
        }
        else
        {
            System.out.print(n1+" is not a krishanamurty number.");
        }
    }
}