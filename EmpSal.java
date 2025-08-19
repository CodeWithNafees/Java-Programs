import java.util.*;
class EmpSal{
public static void main(String arg[]){

Scanner sc = new Scanner(System.in);
int id;
String name;
double basicSalary, grossSalary, netSalary, itax, da, hra, ta;

System.out.println("Enter Employee ID: ");
 id = sc.nextInt();

System.out.println("Enter Employee Name: ");
 name = sc.next();

System.out.println("Enter Basic Salary: ");
 basicSalary = sc.nextDouble();

da = basicSalary * 0.05; //5%
hra = basicSalary * 0.12; //12%
ta = basicSalary * 0.08; //8%

grossSalary = basicSalary + da + hra + ta;

itax = basicSalary * 0.10; //10%
netSalary = grossSalary - itax;

System.out.println("Employee ID: "+id);
System.out.println("Employee Name: "+name);
System.out.println("Basic Salary: "+basicSalary);
System.out.println("DA (5%): "+da);
System.out.println("HRA (12%): "+hra);
System.out.println("TA (8%): "+ta);
System.out.println("Gross Salary: "+grossSalary);
System.out.println("Itax (10%): "+itax);
System.out.println("Net Salary: "+netSalary);
}
}