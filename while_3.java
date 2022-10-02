import java.util.*;
public class while_3
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a numebr: ");
        int n=sc.nextInt();
        int d=0,h=0,h2=0;
        while (n>0)
        {
            d=n%10;
            if (d>h)
            {
                h=d;
            }
            else if (d<h && d>h2)
            {
                h2=d;
            }
            n/=10;
        }
        System.out.print(h2);
    }
}
