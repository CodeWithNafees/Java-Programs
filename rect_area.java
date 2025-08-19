import java.util.*;
class rect_area
{
public static void main(String arg[])
{
int length , breadth , area;

Scanner sc=new Scanner(System.in);

System.out.println("Enter Length of Rectangle:");
	length=sc.nextInt();
System.out.println("Enter breadth of Rectangle:");
	breadth=sc.nextInt();
area = length * breadth;

System.out.println("The Area of Rectangle = "+area);

}
}