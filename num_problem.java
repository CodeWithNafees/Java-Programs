import java.util.Scanner;
class num_problem
{
  public static void main(String arg[])
{
  int a,ch;

  Scanner sc=new Scanner(System.in);

  System.out.print("Enter Any No: ");
  a=sc.nextInt();
  

  System.out.println("1.Even or Odd\n2.Positive or Negative");

  System.out.println("Enter Your Chooice");
  ch=sc.nextInt();

  switch(ch)
{
   case 1:
   if(a % 2 == 0)
   {
	System.out.println("Even Number!");
   }
   else
  {
	System.out.println("Odd Number!");
  }
   break;

   case 2:
  if(a > 0)
  {
	System.out.println("Positive Number!");
  }
  else
  {
	System.out.println("Negative Number!");
  }
   break;


   default:
   System.out.println("Invalid Choice");
   break;
}
}
}