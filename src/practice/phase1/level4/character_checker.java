package practice.phase1.level4;
import java.util.Scanner;

public class character_checker {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("Character checker");
        System.out.println("---------------");


        System.out.print("Enter a character: ");

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        c = Character.toUpperCase(c);

        if(c>= 'A' && c <= 'Z'){
            System.out.println("character is an alphabet");
        }else if(c>= '0' && c <='9'){
            System.out.println("character is a number");
        }else{
            System.out.println("invalid character");
        }

        sc.close();
    }
}
