import java.util.*;
public class while_23
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int a=2*n,s=0;
        for (int x=1;x<=n;x++)
        {
            if (n%x==0)
            {
                s+=x;
            }
        }
        if (s>a)
        {
            System.out.print(n+" is a abundent number.");
        }
        else
        {
            System.out.print(n+" is not a aboundent number.");
        }
    }
}