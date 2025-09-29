class addition implements Runnable
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

class substract implements Runnable
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

class multiplication implements Runnable
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


class thread2 {
  public static void main(String[] args) {
    addition a = new addition();
    substract s = new substract();
    multiplication m = new multiplication();

    Thread t1=new Thread(a);
       Thread t2=new Thread(s);
   Thread t3=new Thread(m);
    t1.start();
    try
    {
      Thread.sleep(500);
    }
    catch(Exception e){}
    t2.start();
     try
    {
      Thread.sleep(500);
    }
    catch(Exception e){}
    t3.start();
  }
}
