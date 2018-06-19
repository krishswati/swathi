import java.io.*;
import java.util.*;
class Guvi1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if((a>1)&&(a<100000))
        {
            if(a>1)
            {
                System.out.println("positive");
            }
            else if(a==0)
            {
                System.out.print("zero");
            }
            else
            {
                System.out.print("negative");
            }
        }
    }
}
