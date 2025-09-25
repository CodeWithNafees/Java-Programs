class addition extends Thread
{
  public void run()
  {
    int a = 5, b = 10;
    int sum = a + b;
    
      try
      {
        Thread.sleep(1000);
      }
      catch(Exception e){}
      System.out.println("Addition = "+sum);
  }
}

class substract extends Thread
{
  int x = 55, y = 14;
  int sub = x - y;
  public void run()
  {
    try
    {
      Thread.sleep(1000);
    }
    catch(Exception e){}
    System.out.println("Substraction = "+ sub);
  }
}

class multiplication extends Thread
{
  int r = 55, n = 14;
  int mul = r * n;
  public void run()
  {
    try
    {
      Thread.sleep(1000);
    }
    catch(Exception e){}
    System.out.println("Multiplication = "+ mul);
  }
}


class thread_inheritence {
  public static void main(String[] args) {
    addition a = new addition();
    substract s = new substract();
    multiplication m = new multiplication();
    a.start();
    try
    {
      Thread.sleep(500);
    }
    catch(Exception e){}
    s.start();
     try
    {
      Thread.sleep(500);
    }
    catch(Exception e){}
    m.start();
  }
}
