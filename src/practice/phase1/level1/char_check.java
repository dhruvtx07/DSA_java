package practice.phase1.level1;
import java.util.Scanner;

public class char_check {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("Character checker whether it is uppercase, lowercase or special character");
        System.out.println("----------------");

        System.out.print("Enter a character: ");

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        int ascii  = (int)c;

        System.out.printf("value for character %c in ASCII is %d\n", c, ascii);

        if((c >= 'A') && (c <= 'Z')){
            System.out.println("uppercase");
        }else if((c >= 'a') && (c <= 'z')){
            System.out.println("lowercase");
        }else if((c >= '0') && (c <= '9')){
            System.out.println("digit");
        }

        sc.close();

    }
}
