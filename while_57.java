public class while_57
{
    public static void main(String args[])
    {
        int p=0;
        boolean b=false;
        for (int x=100;x<=1000;x++)
        {
            for (int y=1;y<=x;y++)
            {
                p=y*(y+1);
                if (p==x)
                {
                   b=true; 
                }
            }
            if (b==true)
            {
                System.out.println(x);
            }
            p=0;
            b=false;
        }
    }
}