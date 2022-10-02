import java.util.*;
public class while_31
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int sn=n*n,d=0,s=0;
        while (sn>0)
        {
            d=sn%10;
            sn/=10;
            s+=d;
        }
        if (n==s)
        {
            System.out.print(n+" is a neon number.");
        }
        else
        {
            System.out.print(n+" is not a neon number.");
        }
    }
}