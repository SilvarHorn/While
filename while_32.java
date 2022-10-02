public class while_32
{
    public static void main(String args[])
    {
        int sn=0,d=0,s=0;
        for (int x=1;x<=1000;x++)
        {
            sn=x*x;
            while (sn>0)
            {
                d=sn%10;
                sn/=10;
                s+=d;
            }
            if (x==s)
            {
                System.out.println(x);
            }
            s=0;
        }
    }
}