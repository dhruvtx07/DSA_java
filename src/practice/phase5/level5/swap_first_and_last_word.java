package practice.phase5.level5;
import java.util.*;

public class swap_first_and_last_word {
    public static void main(String[] args){
        System.out.println("swap first and last word\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        String[] words = s1.split(" ");

        System.out.println("String before swap: ");
        for(int i = 0; i< words.length; i++){
            for(int j = 0; j<words[i].length(); j++){
                char c = words[i].charAt(j);
                System.out.print(c);
            }
            System.out.print(" ");
        }


        System.out.println("\nString after swap: ");
        String temp = words[0];
        words[0] = words[words.length-1];
        words[words.length-1] = temp;



        for(int i = 0; i< words.length; i++){
            for(int j = 0; j<words[i].length(); j++){
                char c = words[i].charAt(j);
                System.out.print(c);
            }
            System.out.print(" ");
        }

        sc.close();
    }
}
