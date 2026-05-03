package practice.phase5.level5;
import java.util.*;

public class print_longest_word_in_array {
    public static void main(String[] args){
        System.out.println("printing longest word in array\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        System.out.println("\nusing split");
        String[] words = s1.split(" ");
        int max = words[0].length();
        int maxIdx = 0;

        for(int i = 0; i<words.length; i++){
            int length = words[i].length();
            if(max<length){
                max = length;
                maxIdx = i;
            }
        }

        System.out.printf("%d word\n", max);
        for(int i = 0; i<words[maxIdx].length();i++){
            System.out.print(words[maxIdx].charAt(i));
        }



        sc.close();
    }
}

