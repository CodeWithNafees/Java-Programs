import java.util.Scanner;

class profile
{
    String name;
    Scanner sc = new Scanner(System.in);
    profile()
    {
        System.out.print("Enter The Name: ");
        name = sc.nextLine();
    }
}

class subjects extends profile
{
    String sub1,sub2,sub3,sub4,sub5;
    subjects()
    {
        System.out.println("Enter Subject Names: ");
         sub1 =  sc. nextLine();
         sub2 =  sc. nextLine();
         sub3 =  sc. nextLine();
         sub4 =  sc. nextLine();
         sub5 =  sc. nextLine();
    }
}
class display extends subjects {
    display() {
        System.out.println("Name: " + name);
        System.out.println("Subjects are:");
        System.out.println(sub1);
        System.out.println(sub2);
        System.out.println(sub3);
        System.out.println(sub4);
        System.out.println(sub5);
    }
}
public class mulLevInheritance
{
    public static void main(String[] args)
    {
        display d = new display();
    }
}
