package practice.phase5.level2;
import java.util.Scanner;

public class check_how_many_words_starts_with_vowel {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("count how many words in a string starts with vowel");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);


        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        int counter = 0;
        for(int i =0; i<s1.length(); i++){
            System.out.print(s1.charAt(i));
            if(i == 0){
                if(Character.toUpperCase(s1.charAt(i)) == 'A' || Character.toUpperCase(s1.charAt(i)) == 'E' || Character.toUpperCase(s1.charAt(i)) == 'I' || s1.charAt(i) == 'O' || Character.toUpperCase(s1.charAt(i)) == 'U'){
                    counter++;
                }
            }else{
                if(s1.charAt(i) == ' ' && i!=s1.length()-1){
                    if(Character.toUpperCase(s1.charAt(i+1)) == 'A' || Character.toUpperCase(s1.charAt(i+1)) == 'E' || Character.toUpperCase(s1.charAt(i+1)) == 'I' || Character.toUpperCase(s1.charAt(i+1)) == 'O' || Character.toUpperCase(s1.charAt(i+1)) == 'U'){
                        counter++;
                    }
                }

            }
        }

        System.out.printf("\n%d words starting with vowel", counter);
        sc.close();
    }
}
