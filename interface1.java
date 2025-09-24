import java.util.*;
interface client
{
  void input();  //  abstract/public
  void output();
}

class interface1 implements client
{
  String nm;
  int rn,m;

  public void input()  // abstract/ private
  {
     Scanner sc=new Scanner(System.in);

     System.out.println("Enter Name Roll No & Marks");
     nm=sc.nextLine();
     rn=sc.nextInt();
     m=sc.nextInt();
  }
  public void output()
  {
    System.out.println("Name: "+nm);
    System.out.println("Roll No: "+rn);
    System.out.println("Marks: "+m);
  }

  public static void main(String arg[])
  {
    client o=new interface1();
    o.input();
    o.output();
  }
}

