package practice.phase5.level2;
import java.util.*;

public class count_vowel_and_consonants_in_string {
    public static int[] fun(String s1){
        int[] count = new int[2];

        for(char c : s1.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count[0] += 1;
            }else{
                count[1] += 1;
            }
        }
       return count;
    }
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("count vowels and consonants in string");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        int[] count = fun(s1);

        System.out.printf("%d vowels and %d consonants", count[0], count[1]);

        sc.close();
    }
}
