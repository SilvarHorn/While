import java.util.*;
public class while_49
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int d=0,nc=n,s=0;
        while (n>0)
        {
            d=n%10;
            n/=10;
            s+=d;
        }
        if (nc%s==0)
        {
            System.out.print(nc+" is a niven number.");
        }
        else
        {
            System.out.print(nc+" is not a niven number.");
        }
    }
}