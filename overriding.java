class override       // method overriding
{
    int a,b,c;

    void get()
    {
        a=22;
        b=5;

        c=a+b;
        System.out.println("Add:"+c);
    }
}

class sum1 extends override
{
    void get()
    {

        a=3;
        b=5;
        c=a*b;
        System.out.println("Mul:"+c);
    }
}

class overrideing
{
    public static void main(String[] args) {
        sum1 o=new sum1();
        o.get();
    }
}
