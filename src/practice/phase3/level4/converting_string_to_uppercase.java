package practice.phase3.level4;
import java.util.Scanner;

public class converting_string_to_uppercase {
    public static StringBuilder fun(int i, StringBuilder str){
        if(i == str.length()) return str;

        char upper = Character.toUpperCase(str.charAt(i));
        str.setCharAt(i, upper);

        return fun(i+1, str);
    }
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("converting string to uppercase");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter something: ");
        String s1 = sc.nextLine();
        StringBuilder str = new StringBuilder(s1);

        StringBuilder ans = new StringBuilder(fun(0, str));
        System.out.println(ans);
        sc.close();
    }
}
