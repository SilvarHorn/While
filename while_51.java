import java.util.*;
public class while_51
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int d=0,n=0,s=0;
        for (int x=n1;x<=n2;x++)
        {
            n=x;
            while (n>0)
            {
                d=n%10;
                n/=10;
                s+=d;
            }
            if (x%s==0)
            {
                System.out.println(x);
            }
            s=0;
        }
    }
}