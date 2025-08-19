import java.util.Scanner;
class calculator
{
  public static void main(String arg[])
{
  int a,b,c,ch;

  Scanner sc=new Scanner(System.in);

  System.out.print("Enter Any No");
  a=sc.nextInt();
  b=sc.nextInt();

  System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div");

  System.out.println("Enter Your Chooice");
  ch=sc.nextInt();

  switch(ch)
{
   case 1:
   c=a+b;
   System.out.println("Add:"+c);
   break;

   case 2:
   c=a-b;
   System.out.println("Sub:"+c);
   break;

   case 3:
   c=a*b;
   System.out.println("Mul:"+c);
   break;

   case 4:
   c=a/b;
   System.out.println("Div:"+c);
   break;

   default:
   System.out.println("Invalid Choice");
   break;
}
}
}    