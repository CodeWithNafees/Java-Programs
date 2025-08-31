 abstract class programming     // abstract
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

class java extends programming
{
    public void developer()
    {
        System.out.println("James Gosling");
    }

    public static void main(String arg[])
    {
        programming o=new C();
        o.developer();
        programming s=new java();
        s.developer();
    }
}

