package p1;
import java.util.*;
public class multiplication {
  Scanner sc = new Scanner(System.in);

  int a, b, sum;

  public void mul ()
  {
    System.out.println("Enter the Number:");
    a = sc.nextInt();
    System.out.println("Enter the Number:");
    b = sc.nextInt();
    sum = a * b;
    System.out.println("The Multiplication = " + sum);
  }

}
