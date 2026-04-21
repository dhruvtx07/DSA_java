package datatypes;

public class conversion {
    public static void main(String[] args){

        System.out.println("\n\nexample of widening conversion also known as implicit conversion, it is automatically done, from small to big");
        byte a = 1;
        short b = a;
        int c = a;
        long d = a;

        float e = a;
        double f = a;

        System.out.println("a as byte: "+a);
        System.out.println("a as short: "+b);
        System.out.println("a as int: "+c);
        System.out.println("a as long: "+d);
        System.out.println("a as float: "+e);
        System.out.println("a as double: "+f);

        System.out.println("\n\nexample of narrowing conversion also known as explicit conversion, we have to do this manually, from big to small");

        double f1 = 1.123456789;
        float e1 = (float)f1;
        long d1 = (long)f1;
        int c1 = (int)f1;
        short b1 = (short)f1;
        byte a1 = (byte)f1;

        System.out.println("a as double: "+f1);
        System.out.println("a as float: "+e1);
        System.out.println("a as long: "+d1);
        System.out.println("a as int: "+c1);
        System.out.println("a as short: "+b1);
        System.out.println("a as byte: "+a1);
    }
}
