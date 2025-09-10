class abcd
{
  abcd()
  {
    System.out.println("Hello");
  }
}

class abcd1 extends abcd
{
  abcd1()
  {
    super();
    System.out.println("Welcome");
  }
}
class super123 
{
  public static void main(String[] args) {
    abcd1 o=new abcd1();

  }
  
}
