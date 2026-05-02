package practice.phase5.level1;
import java.util.Scanner;

public class print_first_and_last_character {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("input string and print first and last letter");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("enter something: ");
        String str = sc.nextLine();

        System.out.println();
        System.out.println("printing first and last character using index 0 and length()-1");
        System.out.printf("first character - %c and last character - %c\n\n", str.charAt(0), str.charAt(str.length()-1));

        System.out.println("printing first and last character using loop");

        for(int i = 0; i<str.length(); i++){
            if(i == 0 || i == str.length()-1){
                System.out.printf("%c, ", str.charAt(i));
            }
        }

        sc.close();
    }
}

