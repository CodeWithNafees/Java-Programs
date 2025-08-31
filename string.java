public class string
{
    public static void main(String[] args)
    {
        String a="hello";
        String b="hello";
        String c="Hello";

        String str=new String("Welcome In Disha");

        System.out.println(a);
        System.out.println(str);
        System.out.println(a.toUpperCase());
        System.out.println(c.toLowerCase());
        System.out.println(a.length());
        System.out.println(c.charAt(4));
        System.out.println(str.indexOf('D'));
        System.out.println(a.startsWith("h"));
        System.out.println(a.endsWith("O"));
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(c));
        System.out.println(str.contains("W"));
        System.out.println(a.concat(str));
        System.out.println(a.replace('l','t'));


    }
}
