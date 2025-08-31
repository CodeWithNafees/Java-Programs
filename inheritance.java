class inherit          //  base class
{
    int a, b, c;            // single inheritance

    void get()
    {
        a = 12;
        b = 4;
    }
}

class demo1 extends inherit       //derive class
{
    void disp()
    {
        c=a+b;
        System.out.println("Add:"+c);
    }
}

class inheritance
{
    public static void main(String arg[])
    {
        demo1 o=new demo1();
        o.get();
        o.disp();
    }
}
