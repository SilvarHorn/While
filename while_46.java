import java.util.*;
public class while_46
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int d=0,s1=0,s2=0,n1=n,r=0,q=0;
        while (n>0)
        {
            d=n%10;
            n/=10;
            s1+=d;
        }
        s2=s1;
        while (s1>0)
        {
            d=s1%10;
            s1/=10;
            r=(r*10)+d;
        }
        q=r*s2;
        if (n1==q)
        {
            System.out.print(n1+" is a ramanujan number.");
        }
        else
        {
            System.out.print(n1+" is not a ramanujan numebr.");
        }
    }
}