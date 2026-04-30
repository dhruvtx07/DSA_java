package practice.phase3.level4;
import java.util.Scanner;

public class print_string_in_reverse_using_recursion {
    public static void fun(int i, String s1){
        if(i == s1.length()){
            return;
        }

        fun(i+1, s1);
        System.out.printf("%d - %c\n", i, s1.charAt(i));
    }
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("printing string characters in reverse using recursion: ");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter something: ");
        String s1 = sc.nextLine();
        fun(0, s1);
        sc.close();
    }
}
