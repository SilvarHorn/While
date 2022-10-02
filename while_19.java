import java.util.*;
public class while_19
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int a=n*n,c=0,d=0,n1=n,r=0;
        while (n>0)
        {
            n/=10;
            c++;
        }
        d=(int)Math.pow(10,c);
        r=a%d;
        if (n1==r)
        {
            System.out.print(n1+" is a automorphic number.");
        }
        else
        {
            System.out.print(n1+" is not a automorphic number");
        }
    }
}