import java.util.*;
public class while_2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a numebr: ");
        int n=sc.nextInt();
        int d=0,h=0;
        while (n>0)
        {
            d=n%10;
            if (d>h)
            {
                h=d;
            }
            n/=10;
        }
        System.out.print(d);
    }
}
