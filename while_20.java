public class while_20
{
    public static void main(String args[])
    {
        int a=0,c=0,d=0,n=0,r=0;
        for (int x=1;x<=1000;x++)
        {
            n=x;
            a=n*n;
            while (n>0)
            {
                n/=10;
                c++;
            }
            d=(int)Math.pow(10,c);
            r=a%d;
            if (x==r)
            {
                System.out.println(x);
            }
            c=0;
        }
    }
}