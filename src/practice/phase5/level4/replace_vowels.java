package practice.phase5.level4;
import java.util.*;

public class replace_vowels {
    public static void main(String[] args){
        System.out.print("replace vowels with character\n\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter character: ");
        char c = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("enter string: ");
        String s1 = sc.nextLine();
        StringBuilder str = new StringBuilder(s1);

        System.out.println("before string: ");
        for(int i = 0;i<str.length(); i++) {
            System.out.print(str.charAt(i));
        }

        for(int i = 0;i<str.length(); i++){
            if(Character.toUpperCase(s1.charAt(i))=='A' || Character.toUpperCase(s1.charAt(i))=='E' || Character.toUpperCase(s1.charAt(i))=='I' || Character.toUpperCase(s1.charAt(i))=='O' || Character.toUpperCase(s1.charAt(i))=='U'){
                str.setCharAt(i, c);
            }
        }

        System.out.println("\nafter string: ");
        for(int i = 0;i<str.length(); i++) {
            System.out.print(str.charAt(i));
        }






        sc.close();
    }
}
