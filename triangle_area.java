import java.util.*;
class triangle_area
{
public static void main(String arg[])
{
float length , height , area;
 

Scanner sc=new Scanner(System.in);

System.out.println("Enter Length of Triangle:");
	length=sc.nextFloat();
System.out.println("Enter breadth of triangle:");
	height=sc.nextFloat();

area = 0.5f * length * height;

System.out.println("The Area of triangle = "+area);

}
}