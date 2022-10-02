import java.util.*;
public class while_21
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int c=0,a=n*n,n1=n,s=0,fd=0,ld=0;
        while (n>0)
        {
            n/=10;
            c++;
        }
        fd=a/(int)Math.pow(10,c);
        ld=a%(int)Math.pow(10,c);
        s=fd+ld;
        if (s==n1)
        {
            System.out.print(n1+" is a kaprekar numebr.");
        }
        else
        {
            System.out.print(n1+" is not a kaprekar numebr.");
        }
    }
}