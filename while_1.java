import java.util.*;
public class while_1
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a numebr: ");
        int n=sc.nextInt();
        int d=0;
        while (n>0)
        {
            d=n%10;
            System.out.println(d);
            n/=10;
        }
    }
}
