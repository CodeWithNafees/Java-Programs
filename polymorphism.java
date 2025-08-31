class poly              // method overloading
{
    int a,b,c;

    void get()
    {
        a=12;
        b=5;

        c=a+b;
        System.out.println("Add:"+c);
    }

    void get(int x,int y)
    {
        a=x;
        b=y;

        c=a*b;
        System.out.println("Mul:"+c);
    }

    void get(int d)
    {
        a=33;
        b=d;

        c=a-b;
        System.out.println("Sub:"+c);
    }
}

class polymorphism
{
    public static void main(String[] args)
    {
        poly o=new poly();
        o.get();
        o.get(12,55);
        o.get(5);
    }
}

