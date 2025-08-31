import java.sql.SQLOutput;
import java.util.*;
class demo
{
    Scanner sc = new Scanner(System.in);
    int a, b, c;
 void get()
 {
     System.out.print("Enter any number: ");
     a=sc.nextInt();
     System.out.print("Enter any Number: ");
     b = sc.nextInt();

     c = a + b;
 }

 void sum()
        {
            System.out.println("Addition: "+c);
        }
}

public class myclass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        demo d = new demo();
        d.get();
        d.sum();

    }
}
