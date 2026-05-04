package practice.phase5.level5;
import java.util.*;

public class check_how_many_letters_contains_character {
    public static void main(String[] args){
        System.out.println("check how many words contains a character");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a character: ");
        char c = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("enter string: ");
        String str = sc.nextLine();

        int counter = 1;
        boolean found = false;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == c){
                found = true;
                System.out.printf("found in word %d\n", counter);
            }
            found = false;
            if(str.charAt(i) == ' '){
                counter++;
                found = false;
            }
        }

        sc.close();
    }
}
