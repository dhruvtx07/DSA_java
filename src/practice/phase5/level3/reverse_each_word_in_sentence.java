package practice.phase5.level3;
import java.util.Scanner;

public class reverse_each_word_in_sentence {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("reverse each word in sentence");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s1 = sc.nextLine();

        System.out.println("printing string: ");
        for(char c : s1.toCharArray()){
            System.out.print(c);
        }

        System.out.println("\nprinting string words in reverse using split and String[] arr traversal: ");
        String[] words = s1.split(" ");

        for(int i = 0; i<words.length; i++){
            for(int j = words[i].length()-1; j>=0; j--){
                System.out.print(words[i].charAt(j));
            }
            System.out.printf(" ");
        }

        System.out.println("\nprinting string words in reverse using reverse loop: ");

        int space = 0;
        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i) == ' '){
                for(int j = i-1; j>=space; j-- ){
                    if(s1.charAt(j) != ' '){
                        System.out.print(s1.charAt(j));
                    }
                }
                System.out.print(" ");
                space = i;
            }
            if(i == s1.length()-1){
                for(int j = i; j>=space; j-- ){
                    if(s1.charAt(j) != ' '){
                        System.out.print(s1.charAt(j));
                    }
                }
                System.out.print(" ");
            }
        }
        sc.close();
    }
}
