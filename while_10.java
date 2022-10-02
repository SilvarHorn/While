import java.util.*;
public class while_10
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int d=0,r=0,n=0;
        for (int x=n1;x<=n2;x++)
        {
            n=x;
            while (n>0)
            {
                d=n%10;
                n/=10;
                r=(r*10)+d;
            }
            if (x==r)
            {
                System.out.println(x);
            }
            r=0;
        }
    }
}