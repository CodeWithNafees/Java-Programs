import java.util.*;
public class A1Q8
{
    public static void main(String[] args)
    {
        int a[][]=new int[2][2],i,j;

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Array Element");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("2 D Array");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
