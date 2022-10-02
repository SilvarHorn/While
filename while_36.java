import java.util.*;
public class while_36
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int d=0,r=0,c1=0,c2=0,n=0;
        for (int i=n1;i<=n2;i++)
        {
            n=i;
            for (int x=1;x<=n;x++)
            {
                if (n%x==0)
                {
                    c1++;
                }
            }
            while (n>0)
            {
                d=n%10;
                n/=10;
                r=(r*10)+d;
            }   
            for (int y=1;y<=r;y++)
            {
                if (r%y==0)
                {
                    c2++;
                }
            }
            if (c1==2 && c2==2)
            {
                System.out.println(i);
            }
            c1=0;
            c2=0;
            r=0;
        }
    }
}