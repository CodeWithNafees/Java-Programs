import java.util.*;
class using_var_swap
{
public static void main(String arg[])
{

int a , b , temp;

Scanner sc=new Scanner(System.in);

System.out.println("Enter any number:");
	a=sc.nextInt();
System.out.println("Enter any number:");
	b=sc.nextInt();

temp=a;
a=b;
b=temp;

System.out.println("Swapped a to b :"+b);
System.out.println("Swapped b to a :"+a);


}
}