package practice.phase3.level4;
import java.util.Scanner;

public class count_vowels_and_constants_in_string_using_recursion {
    public static void fun(int i, String str, int vowel, int constant){
        if(i == str.length()){
            System.out.printf("vowel: %d\n", vowel);
            System.out.printf("constant: %d", constant);
            return;
        }

        if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
            vowel += 1;
        }else if(str.charAt(i) != ' '){
            constant += 1;
        }
        fun(i+1, str, vowel, constant);
    }

    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("counting vowels and constants using recursion");
        System.out.println("---------------");


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: ");
        String str = sc.nextLine();

        fun(0, str, 0, 0);

        sc.close();
    }
}
