public class while_15
{
    public static void main(String args[])
    {
        int f=0,n=0;
        for (int x=1;x<=100;x++)
        {
            n=x;
            for (int y=1;y<n;y++)
            {
                if (n%y == 0)
                {
                    f+=y;
                }
            }
            if (f==n)
            {
                System.out.println(n);
            }
            f=0;
        }
    }
}