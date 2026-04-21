package datatypes;

public class Datatypes {
    public static void main(String[] args){
        System.out.println("Datatypes in java are of two types -> primitive datatypes, non primitive datatypes");

        System.out.println("Syntax -> datatype variableName = value;");

        System.out.println("-----------------");
        System.out.println("Numeric Datatypes");
        System.out.println("-----------------");

        // integer numeric datatypes
        System.out.println("Java has various numeric datatypes like, byte, short, int, long");

        System.out.println("-----------------");
        System.out.println("Range of Byte -> Byte Size is 1 Byte");
        byte a = 1;
        System.out.println("Example of Byte is " + a);
        System.out.println("Min Range of Byte is " + Byte.MIN_VALUE);
        System.out.println("Max Range of Byte is " + Byte.MAX_VALUE);


        System.out.println("-----------------\n");
        System.out.println("Range of Short -> Short Size is 2 Bytes");
        short b = 1;
        System.out.println("Example of Short is " + b);
        System.out.println("Min Range of Short is " + Short.MIN_VALUE);
        System.out.println("Max Range of Short is " + Short.MAX_VALUE);

        System.out.println("-----------------\n");
        System.out.println("Range of Int -> Int Size is 4 Bytes");
        int c = 1;
        System.out.println("Example of Int is " + c);
        System.out.println("Min Range of Int is " + Integer.MIN_VALUE);
        System.out.println("Max Range of Int is " + Integer.MAX_VALUE);

        System.out.println("-----------------\n");
        System.out.println("Range of Long -> Long Size is 8 Bytes");
        long d = 1289289282892892892l; //defined with l at the end
        System.out.println("Example of Long is " + d);
        System.out.println("Min Range of Long is " + Long.MIN_VALUE);
        System.out.println("Max Range of Long is " + Long.MAX_VALUE);


        System.out.println("\n-----------------");
        System.out.println("Java has various decimal datatypes as well like float, double");

        System.out.println("-----------------\n");
        System.out.println("Range of Float -> Float Size is 4 Bytes"); // 7 decimal digits
        float e = 1.1f; // defined with f at the last
        System.out.println("Example of Float is " + e);
        System.out.println("Min Range of Float is " + Float.MIN_VALUE);
        System.out.println("Max Range of Float is " + Float.MAX_VALUE);

        System.out.println("-----------------\n");
        System.out.println("Range of Double -> Double Size is 8 Bytes");  // 15 decimal digits
        double f = 1.14;
        System.out.println("Example of Double is " + f);
        System.out.println("Min Range of Double is " + Double.MIN_VALUE);
        System.out.println("Max Range of Double is " + Double.MAX_VALUE);

        System.out.println("-----------------");
        System.out.println("Boolean");


        System.out.println("-----------------\n");
        System.out.println("Range of Boolean -> Boolean Size is 1 bit");
        System.out.println("Boolean can only be true or false");
        boolean g = true; // can be true or false only
        System.out.println("Example of Boolean is " + g);

        System.out.println("-----------------");
        System.out.println("Char");


        System.out.println("-----------------\n");
        System.out.println("Range of Char -> Char Size is 2 bytes");
        System.out.println("char is single character \nchar value is defined inside single quotes");
        char h = 'a'; // char value is defined inside single quotes
        System.out.println("Example of Boolean is " + g +"\n");

        System.out.println("Min value of char ASCII value is " + (int)Character.MIN_VALUE);
        System.out.println("Max value of char ASCII value is " + (int)Character.MAX_VALUE);


        System.out.println("\nEvery char has an int value -> ASCII VALUE");
        System.out.println("type cast char into int to gets its ASCII Value");
        char test = 'a'; // char value is defined inside single quotes
        System.out.println("ASCII Value of 'a' is " + (int)test);

        System.out.println("\n"+(char)10084);


        System.out.println("-----------------");
        System.out.println("Sting Datatypes");
        System.out.println("-----------------");

        // integer numeric datatypes
        System.out.println("String is a non primitive datatype in java, it can have combination of alphanumeric values");

        System.out.println("-----------------");
        System.out.println("We can define String in two ways");

        String s1 = "Hello";
        System.out.println("String s1 = value enclosed in double quotes, this type of declaration is known as literal definition for String output for s1" + s1);

        String s2 = "World";
        System.out.println("String s2 = new String(value) passed into String Class Constructor,  new keyword means the object is being crated, s2 is a object of String class output for s2" + s2);


        System.out.println("Note: All variables are stored in Stack memory, except for Strings, they are stored in Heap (String pool)");
        System.out.println("Note: String variables only store the memory references for their value, not the actual value unlike others");

        String str1 = "hello"; // hello stored in heap memory, str1 is holding memory address for hello
        String str2 = "hello"; // hello already stored in heap memory, str2 is holding memory address for hello


        String str3 = new String("hello");

        System.out.println("are str1 = hello and str3 = new String(hello) pointing to the same reference?");
        System.out.println(str1 == str3);

        System.out.println("are str1 = hello and str3 = hello have the same value?");
        System.out.println(str1.equals(str3));



    }
}
