package practice.phase5.level1;
import java.util.Scanner;

public class print_ASCII_value_for_each_character {
    public static void main(String[] args) {
        System.out.println("---------------");
        System.out.println("printing ASCII value for each character");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s1 = sc.nextLine();

        System.out.println();
        System.out.println();

        for(int i = 0; i< s1.length(); i++){
            System.out.printf("%d, ", (int)s1.charAt(i));
        }

        sc.close();
    }
}
