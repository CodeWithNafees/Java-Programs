class multi
{

        int a, b, c;            // multilevel inheritance

        multi()
        {
            a = 12;
            b = 4;
        }
}

class demo2 extends multi      //derive class
    {
          demo2()
        {
            c=a+b;
            System.out.println("Add:"+c);
        }
    }

class mul extends demo2
    {
          mul()
        {
            c=a*b;
            System.out.println("Mul:"+c);
        }
    }

    class multilevel
    {
        public static void main(String arg[])
        {
            mul o=new mul();
        }
    }


