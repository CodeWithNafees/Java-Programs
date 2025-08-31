import java.util.Scanner;
public class A1Q4
{
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any 3 number: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b && b > c)
        {
            System.out.println("The A is the gratest Number!");
        }
        else if (b > a && a > c)
        {
            System.out.println("The B is the greatest number!");
        }
        else
        {
            System.out.println("The C is the greatest Number!");
        }
    }
}
