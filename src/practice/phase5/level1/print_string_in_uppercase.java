package practice.phase5.level1;
import java.util.Scanner;

public class print_string_in_uppercase {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("input string and print uppercase string");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("enter something: ");
        String str = sc.nextLine();

        System.out.println();
        System.out.println("using for each loop");

        for(char c : str.toCharArray()){
            System.out.printf("%c", Character.toUpperCase(c));
        }

        System.out.println();
        System.out.println("using for loop");

        for(int i = 0; i<str.length(); i++){
            System.out.printf("%c", Character.toUpperCase(str.charAt(i)));
        }

        sc.close();
    }
}
