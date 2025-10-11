import java.util.*;
class add_two_num
{
	public static void main(String arg[])
	{
		int a , b , sum;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter any number: ");
		a=sc.nextInt();
		System.out.println("Enter any number: ");
		b=sc.nextInt();
		sum = a + b;

		System.out.println("Addition = "+sum);
	}
}