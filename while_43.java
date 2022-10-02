import java.util.*;
public class while_43
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int s=1,f=0;
        for (int x=1;x<=n;x++)
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
        System.out.print(s+" is the primorial number of "+n);
    }
}