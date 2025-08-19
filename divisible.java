import java.util.*;
class divisible{

public static void main(String arg[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the Number: ");
	int n = sc.nextInt();
if(n % 7 == 0 && n % 5 ==0){
System.out.print("The Your Number is Divisible by 5 and 7");
}
else {
System.out.print("The Your Number is NOT Divisible by 5 and 7");
}
}
}
