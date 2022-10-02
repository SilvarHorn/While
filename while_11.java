import java.util.*;
public class while_11
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a numebr: ");
        int n=sc.nextInt();
        int d=0,s=0,n1=n,c=0;;
        while (n1>0)
        {
            d=n1%10;
            n1/=10;
            c++;
        }
        n1=n;
        while (n>0)
        {
            d=n%10;
            n/=10;
            s+=(int)Math.pow(d,c);
        }
        if (n1==s)
        {
            System.out.print(n1+" is a Armstrong number.");
        }
        else
        {
            System.out.print(n1+" is not a Armstrong number.");
        }
    }
}