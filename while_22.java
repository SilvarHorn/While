public class while_22
{
    public static void main(String args[])
    {
        int c=0,a=0,n=0,s=0,fd=0,ld=0;
        for (int x=1;x<=1000;x++)
        {
            n=x;
            a=n*n;
            while (n>0)
            {
                n/=10;
                c++;
            }
            fd=a/(int)Math.pow(10,c);
            ld=a%(int)Math.pow(10,c);
            s=fd+ld;
            if (s==x)
            {
                System.out.println(x);
            }
            c=0;
        }
    }
}