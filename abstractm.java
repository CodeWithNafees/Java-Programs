abstract class programming
{
  abstract void developer();
}

class C extends programming
{
  public void developer()
  {
    System.out.println("Denis Ritche");
  }
}

class Java extends programming
{
  public void developer()
  {
    System.out.println("James Gosling");
  }
}

class abstractm
{
  public static void main(String arg[])
  {
    programming o=new C();
    o.developer();
    programming s=new Java();
    s.developer();
  }
}
