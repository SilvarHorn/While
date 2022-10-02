public class while_60
{
    public static void main(String args[])
    {
        int c=0,d=0,n=0,s=0,p=0,r=0;
        for (int x=1000;x<10000;x++)
        {
            n=x;
            while (n>0)
            {
                n/=10;
                c++;
            }
            n=x;
            if (c%2==0)
            {
                p=(int)Math.pow(10,c/2);
                s=(n%p)+(n/p);
                r=(int)Math.pow(s,2);
            }
            if (r==x)
            {
                System.out.println(x);
            }
            c=0;
        }
    }
}