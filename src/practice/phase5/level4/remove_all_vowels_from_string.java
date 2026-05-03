package practice.phase5.level4;
import java.util.*;

public class remove_all_vowels_from_string {
    public static void main(String[] args){
        System.out.println("------------------");
        System.out.println("removing vowels from string");
        System.out.println("------------------");

        Scanner sc = new Scanner(System.in);


        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        StringBuilder str = new StringBuilder(s1);

        System.out.println("before string:");
        for(int i = 0; i<s1.length(); i++){
            System.out.print(str.charAt(i));
        }

        for(int i = 0; i<str.length(); i++){
            if(Character.toUpperCase(str.charAt(i)) == 'A' || Character.toUpperCase(str.charAt(i)) == 'E' || Character.toUpperCase(str.charAt(i)) == 'I' || Character.toUpperCase(str.charAt(i)) == 'O' || Character.toUpperCase(str.charAt(i)) == 'U' ){
                str.deleteCharAt(i);
                i--;
            }
        }

        System.out.println("\nafter string:");
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }


        sc.close();
    }
}
