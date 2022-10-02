import java.util.*;
public class while_26
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int d=0,p=0,s=0,c=0,n1=n,n2=n;
        while (n>0)
        {
            n/=10;
            c++;
        }
        while (n1>0)
        {
            d=n1%10;
            p=(int)Math.pow(d,c);
            s+=p;
            n1/=10;
            c--;
        }
        if (n2==s)
        {
            System.out.print(n2+" is a weakarm number.");
        }
        else
        {
            System.out.print(n2+" is not a weakarm number.");
        }
    }
}