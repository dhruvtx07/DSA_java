package practice.phase6.level2;
import java.util.Scanner;

public class find_the_word_with_max_vowels {
    public static void main(String[] args){
        System.out.println("finding word with max vowels");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        int maxVowel = 0;
        int maxVowelWord = 1;
        int vowel = 0;
        for(int i = 0; i<s1.length(); i++){
            char c = s1.charAt(i);
            char upper = Character.toUpperCase(c);
            if(upper == 'A' || upper == 'E' || upper == 'I' || upper == 'O' || upper == 'U'){
                vowel++;
            }
            if(c == ' '){
                if(maxVowel<vowel){
                    maxVowel = vowel;
                    maxVowelWord++;
                }
                vowel = 0;
            }
            if(i == s1.length()-1){
                if(maxVowel<vowel){
                    maxVowel = vowel;
                }
            }
        }

        System.out.printf("most vowels are there %d vowels in %d word", maxVowel, maxVowelWord);

        sc.close();
    }
}
