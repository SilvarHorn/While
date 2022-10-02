import java.util.*;
public class while_29
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int sn=n*n,d=0,a=0,r1=0,r2=0;
        while (sn>0)
        {
            d=sn%10;
            sn/=10;
            r1=(r1*10)+d;
        }
        a=(int)Math.sqrt(r1);
        while (a>0)
        {
            d=a%10;
            a/=10;
            r2=(r2*10)+d;
        }
        if (r2==n)
        {
            System.out.print(n+" is an atom numebr.");
        }
        else
        {
            System.out.print(n+" is not an atom number");
        }
    }
}