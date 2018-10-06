import java.util.*;
public class solution
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        if(a%2!=0)
        {
            System.out.println("Weird");
        }
        else
        {
            if(a>=2 && a<=5)
            {
                System.out.println("Not Weird");
            }
            if(a>=6 && a<=20)
            {
                System.out.println("Weird");
            }
            if(a>20)
            {
                System.out.println("Not Weird");
            }
        }
    }
}
