class stud
{
  void check(int age)
   {
      if(age<18)
        throw new ArithmeticException("age not valid...");
      else
         System.out.println("Valid age");
   }
}
class throwdemo
{
   public static void main(String args[])
    {
        stud s=new stud();
        s.check(23);
        System.out.println("rest of code get executed...");
    }
}