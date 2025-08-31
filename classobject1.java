class object1
{
    int a,b,c;

    void get(int x,int y)            // member Fun
    {
        a =x;
        b =y;
    }

    void sum()            // Non Member Fun
    {
        c=a+b;
        System.out.println("Add:"+c);
    }
}

public class classobject1
{
    public static void main(String[] args)
    {
        object1 o=new object1();      // classname with object
        o.get(12,34);
        o.sum();       // calling the functions
    }
}

