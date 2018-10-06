import java.util.*;
public class solution
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = 1;
        for(int i = 1; i <= 10; i++)
        {
            result = i*a;
            System.out.println(a+" x "+i+" = "+result);
        }
    }
}
