import java.util.Scanner;
public class A1Q2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a = sc.nextInt();
        System.out.print("Enter any number: ");
        int b = sc.nextInt();


        int sq1 = a * a;
        int sq2 = b * b;

        System.out.println("The Squere of "+a+"= "+sq1);
        System.out.println("The Squere of "+b+"= "+sq2);
    }
}
