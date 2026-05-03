package practice.phase5.level3;
import java.util.Scanner;

public class reverse_order_of_words_in_string {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("reverse order of words in a string");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        System.out.println("reversing order of words using split");
        String[] words = s1.split(" ");
        for(int i = words.length-1; i>=0; i--){
            for(int j = 0; j<words[i].length(); j++){
                System.out.print(words[i].charAt(j));
            }
            System.out.print(" ");
        }

        System.out.println("\nreversing order of words using loop");
        int space = s1.length();
        for(int i = s1.length()-1; i>=0; i--){
            if(s1.charAt(i) == ' '){
                for(int j = i+1; j<space; j++ ){
                    System.out.print(s1.charAt(j));
                }
                space = i;
                System.out.print(" ");
            }
            if(i == 0){
                for(int j = i; j<space; j++ ){
                    System.out.print(s1.charAt(j));
                }
            }
        }


        sc.close();
    }
}
