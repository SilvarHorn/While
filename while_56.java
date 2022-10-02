import java.util.*;
public class while_56
{
    public static void mian(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int p=0;
        boolean b=false;
        for (int x=1;x<=n;x++)
        {
            p=x*(x+1);
            if (p==n)
            {
               b=true; 
            }
        }
        if (b==true)
        {
            System.out.print(n+" is a pronic number.");
        }
        else
        {
            System.out.print(n+" is not a pronic numeber.");
        }
    }
}