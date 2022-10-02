public class while_47
{
    public static void main(String args[])
    {
        int d=0,s1=0,s2=0,n=0,r=0,q=0;
        for (int x=100;x<=1000;x++)
        {
            n=x;
            while (n>0)
            {
                d=n%10;
                n/=10;
                s1+=d;
            }
            s2=s1;
            while (s1>0)
            {
                d=s1%10;
                s1/=10;
                r=(r*10)+d;
            }
            q=r*s2;
            if (x==q)
            {
                System.out.println(x);
            }
            s1=0;
            s2=0;
            r=0;
            q=0;
        }
    }
}