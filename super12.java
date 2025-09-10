class A    //  super class
{
  int a=12;
}
class b extends A // sub class
{
   int a=23;
   void show()
   {
    System.out.println(super.a);
    System.out.println(a);
   }
}

class super12
{
  public static void main(String arg[])
  {
    b o=new b();
    o.show();
  }
}
