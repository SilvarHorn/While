import java.util.*;
public class while_4
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a numebr: ");
        int n=sc.nextInt();
        int d=0,c=0;
        while (n>0)
        {
            n/=10;
            c++;
        }
        System.out.print(c);
    }
}
