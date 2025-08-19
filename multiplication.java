import java.util.Scanner;
class table
{


    void get(int number)
    {
        for (int i = 1; i <= 10 ; i++)
        {
            System.out.println( number + " X " +i+ " = " +(number * i));

        }
    }
}

public class multiplication
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        table d = new table();
        d.get(num);
    }
}
