class object                // class with class name
{
    int a,b,c;

    void get()            // member Fun
    {
        a = 12;
        b = 5;
    }

    void sum()            // Non Member Fun
    {
        c=a+b;
        System.out.println("Add:"+c);
    }
}

public class classobject
{
    public static void main(String[] args)
    {
        object o=new object();      // classname with object
        o.get();
        o.sum();       // calling the functions
    }
}

