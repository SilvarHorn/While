import java.util.*;
public class while_28
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int d=0,p=0,s=0,c=0,n=0;
        for (int x=n1;x<=n2;x++)
        {
            n=x;
            while (n>0)
            {
                n/=10;
                c++;
            }
            n=x;
            while (n>0)
            {
                d=n%10;
                p=(int)Math.pow(d,c);
                s+=p;
                n/=10;
                c--;
            }
            if (x==s)
            {
                System.out.println(x);
            }
            s=0;
            c=0;
        }
    }
}