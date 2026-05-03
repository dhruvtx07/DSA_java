package practice.phase5.level5;
import java.util.*;

public class print_each_word_in_new_line {
    public static void main(String[] args){
        System.out.println("print each word in new line\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        int counter = 0;
        for(int i = 0; i<s1.length(); i++){
            char c = s1.charAt(i);
            if(c == ' '){
                System.out.printf("%d, ", counter);
                counter = 0;
            }else{
                counter++;
            }
            if(i == s1.length()-1){
                System.out.printf("%d, ", counter);
            }
        }
        System.out.println("\ncounting word length using split");
        String[] words = s1.split(" ");
        for(int i = 0; i<words.length; i++){
            System.out.printf("length of word %d is %d\n", i+1, words[i].length());
        }


        sc.close();
    }
}
