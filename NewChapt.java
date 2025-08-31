import java.util.*;    //   Herarchical inhr
class chap1
{
    int a,b,c;
    void demo3()
    {
        a=12;
        b=5;
    }
}

class sum extends chap1
{
    void demo4()
    {
        c=a+b;
        System.out.println("Add:"+c);
    }
}

class multip extends chap1
{
    void demo5()
    {
        c=a*b;
        System.out.println("Mul:"+c);
    }
}

public class NewChapt
{
    public static void main(String[] args)
    {
        multip o=new multip();
        sum s=new sum();
        o.demo3();
        s.demo3();
        s.demo4();
        o.demo5();
    }
}
