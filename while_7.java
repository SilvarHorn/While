import java.util.*;
public class while_7
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a numebr: ");
        int n=sc.nextInt();
        int d=0,r=0;
        while (n>0)
        {
            d=n%10;
            n/=10;
            r=(r*10)+d;
        }
        System.out.print(r);
    }
}
