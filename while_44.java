public class while_44
{
    public static void main(String args[])
    {
        for (int i=100;i<=1000;i++)
        {
            int s=1,f=0;
            for (int x=1;x<=i;x++)
            {
                for (int y=1;y<=x;y++)
                {
                    if (x%y==0)
                    {
                        f++;
                    }
                }
                if (f==2)
                {
                    s*=x;
                }
                f=0;
            }
            System.out.println(s);
        }
    }
}