import java.util.*;
public class while_6
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a numebr: ");
        int n=sc.nextInt();
        int d1=0,d2=0,s=0;
        d1=n%10;
        while (n>0)
        {
            d2=n%10;
            n/=10;
        }
        s+=d1+d2;
        System.out.print(s);
    }
}
