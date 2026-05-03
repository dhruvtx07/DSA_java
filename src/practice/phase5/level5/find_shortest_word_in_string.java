package practice.phase5.level5;
import java.util.Scanner;

public class find_shortest_word_in_string {
    public static void main(String[] args){
        System.out.println("finding shortest word in string");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        String[] words = s1.split(" ");

        int min = words[0].length();
        int minIdx = 0;
        for(int i = 0; i< words.length; i++){
            int length = words[i].length();
            if(length<min){
                min = length;
                minIdx = i;
            }
        }

        System.out.printf("%d", minIdx);

        System.out.print("\nprint shortest word\n");
        for(int i = 0; i<words[minIdx].length(); i++){
            char c = words[minIdx].charAt(i);
            System.out.print(c);
        }

        sc.close();
    }
}
