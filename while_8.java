import java.util.*;
public class while_8
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a numebr: ");
        int n=sc.nextInt();
        int d=0,r=0,n1=n;
        while (n>0)
        {
            d=n%10;
            n/=10;
            r=(r*10)+d;
        }
        if (n1==r)
        {
            System.out.print(n1+" is a palindrome number.");
        }
        else
        {
            System.out.print(n1+" is not a palindrome number.");
        }
    }
}