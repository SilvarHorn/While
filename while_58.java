import java.util.*;
public class while_58
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int p=0;
        boolean b=false;
        for (int x=n1;x<=n2;x++)
        {
            for (int y=1;y<=x;y++)
            {
                p=y*(y+1);
                if (p==x)
                {
                   b=true; 
                }
            }
            if (b==true)
            {
                System.out.println(x);
            }
            p=0;
            b=false;
        }
    }
}