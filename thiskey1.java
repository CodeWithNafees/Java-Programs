class A
{
  int a;
  A(int a)
  {
    this.a=a;
  }

  void show()
  {
    System.out.println(a);
  }
}

class thiskey1
{
  public static void main(String arg[])
  {
    A o=new A(77);
    o.show();
  }
}
