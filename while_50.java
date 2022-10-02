public class while_50
{
    public static void main(String args[])
    {
        int d=0,n=0,s=0;
        for (int x=100;x<=1000;x++)
        {
            n=x;
            while (n>0)
            {
                d=n%10;
                n/=10;
                s+=d;
            }
            if (x%s==0)
            {
                System.out.println(x);
            }
            s=0;
        }
    }
}