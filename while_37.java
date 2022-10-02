import java.util.*;
public class while_37
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int d=0,n1=n,c=0;
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
            System.out.print(n1+" is a dusk numebr.");
        }
        else
        {
            System.out.print(n1+" is not a dusk numebr.");
        }
    }
}