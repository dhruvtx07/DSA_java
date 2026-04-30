package practice.phase3.level4;
import java.util.Scanner;

public class printing_string_characters_using_recursion {
    public static void fun(int i, String s1){
        if(i == s1.length()){
            return;
        }
        System.out.printf("%d - %c\n", i, s1.charAt(i));
        fun(i+1, s1);
    }
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("printing string characters using recursion: ");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter something: ");
        String s1 = sc.nextLine();
        fun(0, s1);
        sc.close();
    }
}
