abstract class fruit
{
    abstract void name();
}

class mango extends fruit
{
    void name()
    {
        System.out.println("Mango is the Sweet Fruit!");
    }
}

class Apple extends fruit
{
    void name()
    {
        System.out.println("The Apple is the Good for the Health :)");
    }
}

class Banana extends fruit
{
    void name()
    {
        System.out.println("The Banana is the Very common fruit Easily Available!");
    }
}
public class FruitAbstract
{
    public static void main(String[] args)
    {
        fruit m = new mango();
        m.name();
        fruit a = new Apple();
        a.name();
        fruit b = new Banana();
        b.name();
    }
}
