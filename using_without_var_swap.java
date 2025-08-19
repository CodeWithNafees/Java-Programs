import java.util.*;
class using_without_var_swap
{
public static void main(String arg[])
{

int a , b ;

Scanner sc=new Scanner(System.in);

System.out.println("Enter any number:");
	a=sc.nextInt();
System.out.println("Enter any number:");
	b=sc.nextInt();

a = a + b;
b = a - b;
a = a - b;

System.out.println("Swapped a to b :"+b);
System.out.println("Swapped b to a :"+a);


}
}