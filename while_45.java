import java.util.*;
public class while_45
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for (int i=n1;i<=n2;i++)
        {
            int s=1,f=0;
            for (int x=1;x<=i;x++)
            {
                for (int y=1;y<=x;y++)
                {
                    if (x%y==0)
                    {
                        f++;
                    }
                }
                if (f==2)
                {
                    s*=x;
                }
                f=0;
            }
            System.out.println(s);
        }
    }
}