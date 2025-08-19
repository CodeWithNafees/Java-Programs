import java.util.*;
class stud_data
{
public static void main(String arg[])
{
int rollno;
float english , hindi, marathi , total, per;
String name;

Scanner sc=new Scanner(System.in);

System.out.println("Enter roll number");
	rollno =sc.nextInt();
System.out.println("Enter Name:");
	name =sc.next();

System.out.println("Enter Hindi Marks:");
	hindi =sc.nextFloat();
System.out.println("Enter Marathi Marks:");
	marathi =sc.nextFloat();
System.out.println("Enter English Marks:");
	english =sc.nextFloat();

total = hindi + marathi + english;
per = (total / 300) * 100;

System.out.println("Name of Student:"+name);
System.out.println("Roll no.:"+rollno);
System.out.println("Hindi Marks:"+hindi);
System.out.println("Marathi Marks:"+marathi);
System.out.println("English Marks:"+english);
System.out.println("Total Marks:"+ total);
System.out.println("Percentage:"+per);

}
}



