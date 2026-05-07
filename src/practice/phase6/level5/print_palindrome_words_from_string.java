package practice.phase6.level5;
import java.util.Scanner;

public class print_palindrome_words_from_string {
    public static void main(String[] args){
        System.out.println("print palindrome words from string");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        String[] words = s1.split(" ");
        for(int i = 0; i< words.length; i++){
            int low = 0;
            int high = words[i].length()-1;
            boolean palindrome = true;
            while(low<high){
                char cLow = words[i].charAt(low);
                char cHigh = words[i].charAt(high);
                if(cLow != cHigh){
                    palindrome = false;
                }
                low++;
                high--;
            }
            if(palindrome){
                System.out.printf("%d word is palindrome\n", i+1);
            }
        }


        sc.close();
    }
}
