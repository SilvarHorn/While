import java.util.*;
public class while_25
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int a=0,s=0;
        for (int y=n1;y<=n2;y++)
        {
            a=2*y;
            for (int x=1;x<=y;x++)
            {
                if (y%x==0)
                {
                    s+=x;
                }
            }
            if (s>a)
            {
                System.out.println(y);
            }
            s=0;
        }
    }
}
