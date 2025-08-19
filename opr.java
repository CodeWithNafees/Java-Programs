import java.util.Scanner;
class opr
{
  public static void main(String arg[])
{
  int a,b,c;

  Scanner sc=new Scanner(System.in);

  System.out.println("Enter 3 Sides Of Triangle");
  a=sc.nextInt();
  b=sc.nextInt();
  c=sc.nextInt();

  if(a==b && b==c)
 {
   System.out.println("Equilatral");
 }

  else if(a==b || b==c || a==c)
 {
    System.out.println("Isoscale");
 }

  else if(c*c==a*a+b*b || a*a==b*b+c*c || b*b==a*a+c*c)
 {
   System.out.println("Right Angle");
 }

  else
 {
   System.out.println("Scalen");
 }
}
}