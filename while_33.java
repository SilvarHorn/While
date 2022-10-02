import java.util.*;
public class while_33
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sn=0,d=0,s=0;
        for (int x=n1;x<=n2;x++)
        {
            sn=x*x;
            while (sn>0)
            {
                d=sn%10;
                sn/=10;
                s+=d;
            }
            if (x==s)
            {
                System.out.println(x);
            }
            s=0;
        }
    }
}