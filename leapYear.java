import java.util.*;
class leapYear
{

public static void main(String arg[])
{

Scanner sc = new Scanner(System.in);

System.out.print("Enter the Year: ");
	int n = sc.nextInt();
if(n % 4 == 0){
System.out.print("Leap year!");
}
else {
System.out.print("This is NOT Leap Year!");
}
}
}
