public class while_30
{
    public static void main(String args[])
    {
        int sn=0,d=0,a=0,r1=0,r2=0;
        for (int x=1;x<=100;x++)
        {
            sn=x*x;
            while (sn>0)
            {
                d=sn%10;
                sn/=10;
                r1=(r1*10)+d;
            }
            a=(int)Math.sqrt(r1);
            while (a>0)
            {
                d=a%10;
                a/=10;
                r2=(r2*10)+d;
            }
            if (r2==x)
            {
                System.out.println(x);
            }
            r1=0;
            r2=0;
        }
    }
}