import java.util.*;
public class while_16
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int f=0,n=0;
        for (int x=n1;x<=n2;x++)
        {
            n=x;
            for (int y=1;y<n;y++)
            {
                if (n%y == 0)
                {
                    f+=y;
                }
            }
            if (f==n)
            {
                System.out.println(n);
            }
            f=0;
        }
    }
}