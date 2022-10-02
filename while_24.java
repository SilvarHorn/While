public class while_24
{
    public static void main(String args[])
    {
        int a=0,s=0;
        for (int y=1;y<=100;y++)
        {
            a=2*y;
            for (int x=1;x<=y;x++)
            {
                if (y%x==0)
                {
                    s+=x;
                }
            }
            if (s>a)
            {
                System.out.println(y);
            }
            s=0;
        }
    }
}