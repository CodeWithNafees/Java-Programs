import java.util.*;
class circle
{
public static void main(String arg[])
{float r , area , circum;
float pi= 3.14f;

Scanner sc=new Scanner(System.in);

System.out.println("Enter Redius of Circle:");
	r=sc.nextFloat();


area = pi * r * r;

System.out.println("The Area of Circle = "+area);

circum = 2 * pi * r;

System.out.println("The Circumference = "+circum);

}
}