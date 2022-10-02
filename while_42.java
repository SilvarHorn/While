import java.util.*;
public class while_42
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for (int n=n1;n<=n2;n++)
        {
            if (n%7==0 || n%10==7)
            {
                System.out.println(n);
            }
        }
    }
}