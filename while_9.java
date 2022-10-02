public class while_9
{
    public static void main(String[] args) 
    {
        int d=0,r=0,n=0;
        for (int x=1;x<=100;x++)
        {
            n=x;
            while (n>0)
            {
                d=n%10;
                n/=10;
                r=(r*10)+d;
            }
            if (x==r)
            {
                System.out.println(x);
            }
            r=0;
        }
    }
}