import java.util.Scanner;
class circle_switch
{
  public static void main(String arg[])
{
  double r,area,circum,pi=3.14;

  int ch; 

  Scanner sc=new Scanner(System.in);

  System.out.print("Enter Redius of Circle: ");
  r=sc.nextDouble();  

  System.out.println("1.Area of Circle\n2.Circumference of Circle");

  System.out.println("Enter Your Chooice");
  ch=sc.nextInt();

  switch(ch)
{
   case 1:
  area =  pi* r * r;
  System.out.println("The Area of Circle = "+area);
   break;

   case 2:
  circum = 2 * pi* r;
  System.out.println("The Circumference = "+circum);
   break;


   default:
   System.out.println("Invalid Choice");
   break;
}
}
}