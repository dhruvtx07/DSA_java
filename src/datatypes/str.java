package datatypes;

public class str {
    public static void main(String[] args){
        String str1 ="hello world";

        System.out.println("----------------");
        System.out.println("String in java are immutable, once declared can't be manipulated in their value, without reinitialization");
        System.out.println("----------------");

        System.out.println("Common String Operations");

        System.out.println("----------------");

        System.out.println("str1 = hello world");

        int str1Length = str1.length();
        System.out.println("Length -> str1.length(): "+ str1Length);

        System.out.println("charAt(idx) -> str1.charAt(0): H -> "+ str1.charAt(0));
        System.out.println("accessing values of str1");

        for(int i = 0; i<str1Length;i++){
            System.out.print("\nvalue of idx -> "+ i);
            System.out.print(" charAt(idx) -> str1.charAt(idx): -> "+ str1.charAt(i));
        }


        System.out.println("\n\ncharAt(idx) -> str1.charAt(0): h -> "+ str1.charAt(0));

        System.out.println("substring(startIdx, endIdx) -> str1.substring(0, 5): hello -> "+ str1.substring(0, 5));

        System.out.println("contains(value) -> str1.contains(hello): true -> "+ str1.contains("hello"));
        System.out.println("startsWith(value) -> str1.startsWith(h): true -> "+ str1.startsWith("h"));
        System.out.println("endsWith(value) -> str1.endsWith(e): false -> "+ str1.endsWith("e"));
        System.out.println("equals(value) -> str1.equals(str1): true -> "+ str1.equals("hello world"));

        String str2 = str1.replace("world", "java");
        System.out.println("replace(existingValue, newValue) -> str2 = str1.replace(world, java): Hello Java -> "+ str2);




        str1 = str1.toUpperCase();
        System.out.println("uppercase -> str1.toUpperCase(): "+ str1);
        str1 = str1.toLowerCase();
        System.out.println("lowercase -> str1.toLowerCase(): "+ str1);


    }
}
