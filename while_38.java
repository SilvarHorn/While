public class while_38
{
    public static void main(String args[])
    {
        int d=0,n=0,c=0;
        for (int x=100;x<=1000;x++)
        {
            n=x;
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
                System.out.println(x);
            }
            c=0;
        }
    }
}