import java.util.*;
class percentage
{
public static void main(String arg[])
{
float a, b, c, d, e, total, per;

Scanner sc=new Scanner(System.in);

System.out.println("Enter Marathi Marks:");
	a=sc.nextFloat();
System.out.println("Enter Hindi Marks:");
	b=sc.nextFloat();
System.out.println("Enter English Marks:");
	c=sc.nextFloat();
System.out.println("Enter Maths Marks:");
	d=sc.nextFloat();
System.out.println("Enter Science Marks:");
	e=sc.nextFloat();

total = a + b + c + d + e;
System.out.println("Total marks:"+total);

per= (total / 500) * 100;
System.out.println("Percentage :"+per);
}
}