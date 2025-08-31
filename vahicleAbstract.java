abstract class vehicle
{
    abstract void companies();
}

class twoWheeler extends vehicle
{
    void companies()
    {
        System.out.print("# The Two Wheeler Companies: ");
        System.out.println("Honda, Bajaj, Hero, TVS");
    }
}

class fourWheeler extends vehicle
{
    void companies()
    {
        System.out.println("");
        System.out.print("# The Four Wheeler Companies: ");
        System.out.println("BMW, Mercedes, Ferrari, Bugatti");
    }
}

class bigVehicles extends vehicle
{
     void companies()
     {
         System.out.println("");
         System.out.print("# The Big Vehicle Companies: ");
         System.out.println("Volvo,TATA, Ashok Leyland, Mahindra");
     }
}

public class vahicleAbstract
{
    public static void main(String[] args)
    {
        vehicle t = new twoWheeler();
        t.companies();
        vehicle f = new fourWheeler();
        f.companies();
        vehicle b = new bigVehicles();
        b.companies();
    }
}
