package practice.phase6.level2;
import java.util.Scanner;

public class find_words_that_start_and_end_with_same_word {
    public static void main(String[] args){
        System.out.println("finding words that start and end with same word");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        int counter = 1;
        char first = s1.charAt(0);

        for(int i = 0; i<s1.length(); i++){
            char c = s1.charAt(i);
            if(c == ' '){
                char last = s1.charAt(i-1);
                if(first == last){
                    System.out.printf("word %d starts and ends with same word\n", counter);
                }else{
                    System.out.printf("word %d false\n", counter);
                }
                first = s1.charAt(i+1);
                counter++;
            }

            if(i == s1.length()-1){
                char last = s1.charAt(i);
                if(first == last){
                    System.out.printf("word %d starts and ends with same word\n", counter);
                }else{
                    System.out.printf("word %d false\n", counter);
                }
            }
        }

        sc.close();
    }
}
