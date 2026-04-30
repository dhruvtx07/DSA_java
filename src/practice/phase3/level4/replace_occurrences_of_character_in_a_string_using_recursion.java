package practice.phase3.level4;
import java.util.Scanner;

public class replace_occurrences_of_character_in_a_string_using_recursion {
    public static StringBuilder fun(int i, int n, String s1, char c, char target){
        if(i==n) return s1;

        if(s1.charAt(i) == c){
            s1.charAt(i) = target;
        }

    }
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("replace occurrences of character from string");
        System.out.println("---------------");

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter something: ");
        String s1 = sc.nextLine();

        System.out.print("Enter character to replace: ");
        char c = sc.next().charAt(0);


        System.out.print("Enter character to replace with: ");
        char target = sc.next().charAt(0);

        sc.close();
    }
}
