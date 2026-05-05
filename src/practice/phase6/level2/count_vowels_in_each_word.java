package practice.phase6.level2;
import java.util.*;

public class count_vowels_in_each_word {
    public static void main(String[] args){
        System.out.println("counting vowels in each word");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        int vowel = 0;
        for(int i = 0; i<s1.length(); i++){
            char c = s1.charAt(i);
            if('A' == Character.toUpperCase(c) || 'E' == Character.toUpperCase(c) ||'I' == Character.toUpperCase(c) || 'O' == Character.toUpperCase(c) || 'U' == Character.toUpperCase(c) ) {
                vowel++;
            }
            if(c == ' '){
                System.out.println(vowel);
                vowel = 0;
            }
            if(i == s1.length()-1){
                System.out.print(vowel);
            }

        }


        sc.close();
    }
}
