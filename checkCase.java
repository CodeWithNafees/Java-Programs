import java.util.*;
class checkCase{

public static void main(String arg[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter an Alphabate: ");
	char c = sc.next().charAt(0);

if(c >= 'A' && c <= 'Z' ){
System.out.print("UPPERCASE");
}
else if(c >= 'a' && c <= 'z' ) {
System.out.println("lowecase");
}
else{
System.out.println("This is not alphabate");
}
}
}
