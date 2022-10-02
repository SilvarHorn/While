public class while_18
{
    public static void main(String args[])
    {
        int d=0,f=1,s=0,n=0;
        for (int y=1;y<=100;y++)
        {
            n=y;
            while (n>0)
            {
                d=n%10;
                f=1;
                for (int x=1;x<=d;x++)
                {
                    f*=x;
                }
                s+=f;
                n/=10;
            }
            if (s==y)
            {
                System.out.println(y);
            }
            s=0;
        }
    }
}