import java.util.Scanner;
public class array3D
{
        public static void main(String[] args)
        {
            int a[][]=new int[3][3],i,j;
            int b[][]=new int[3][3];
            int c[][]=new int[3][3];

            Scanner sc=new Scanner(System.in);

            System.out.print("Enter Array Element");
            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }

            System.out.print("Enter 2nd Array Element");
            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                    b[i][j]=sc.nextInt();
                }
            }

            System.out.println("Add of 3d array");
            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                    c[i][j]=a[i][j]+b[i][j];
                    System.out.print(c[i][j]+"\t");
                }
                System.out.println();
            }

        }
    }


