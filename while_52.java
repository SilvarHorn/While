import java.util.*;
public class while_52
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int d=0,s=0,p=1,r=0,n1=n;
        while (n>0)
        {
            d=n%10;
            n/=10;
            s+=d;
            p*=d;
        }
        r=s+p;
        if (r==n1)
        {
            System.out.print(n1+" is a special two digit number.");
        }
        else
        {
            System.out.print(n1+" is not a special two digit numebr.");
        }
    }
}