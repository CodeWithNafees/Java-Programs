import java.util.*;
public class array2
{
    public static void main(String[] args)
    {
        int a[]=new int[5],i;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Array Elements");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Array Elements");
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }

    }
}
