public class while_27
{
    public static void main(String args[])
    {
        int d=0,p=0,s=0,c=0,n=0;
        for (int x=1;x<=100;x++)
        {
            n=x;
            while (n>0)
            {
                n/=10;
                c++;
            }
            n=x;
            while (n>0)
            {
                d=n%10;
                p=(int)Math.pow(d,c);
                s+=p;
                n/=10;
                c--;
            }
            if (x==s)
            {
                System.out.println(x);
            }
            s=0;
            c=0;
        }
    }
}