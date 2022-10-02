import java.util.*;
public class while_39
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int d=0,n=0,c=0;
        for (int x=n1;x<=n2;x++)
        {
            n=x;
            while (n>0)
            {
                d=n%10;
                n/=10;
                if (d==0)
                {
                    c++;
                }
            }
            if (c>0)
            {
                System.out.println(x);
            }
            c=0;
        }
    }
}