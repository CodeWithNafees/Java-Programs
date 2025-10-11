package tablecount;
import java.util.*;
public class table
{
  Scanner sc = new Scanner(System.in);

  public void num ()
  {
    System.out.print("Enter any number: ");
    long n = sc.nextLong();
    for(int i = 1; i <= 10; i++) {
            System.out.println(n +" X "+ i+" = "+n * i);
        }
  }
}