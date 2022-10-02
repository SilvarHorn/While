import java.util.*;
public class while_59
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int c=0,d=0,n1=n,s=0,p=0,r=0;
        while (n>0)
        {
            n/=10;
            c++;
        }
        if (c%2==0)
        {
            p=(int)Math.pow(10,c/2);
            s=(n1%p)+(n1/p);
            r=(int)Math.pow(s,2);
        }
        if (r==n1)
        {
            System.out.print(n1+" is a teach number.");
        }
        else
        {
            System.out.print(n1+" is not a tech number.");
        }
    }
}