package practice.phase3.level4;
import java.util.Scanner;

public class remove_occurrences_of_character_in_a_string_using_recursion {
    public static StringBuilder fun(int i, StringBuilder s1, char c){
        if(i==s1.length()) return s1;

        if(s1.charAt(i) == c){
            s1.deleteCharAt(i);
            return fun(i, s1, c);
        }

        return fun(i+1, s1, c);

    }
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("remove occurrences of character from string");
        System.out.println("---------------");

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter something: ");
        String s1 = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char c = sc.next().charAt(0);

        StringBuilder str = new StringBuilder(s1);
        StringBuilder s2 = new StringBuilder(fun(0, str, c));

        System.out.println(s2);

        sc.close();
    }
}
