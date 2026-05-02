package practice.phase5.level2;
import java.util.Scanner;

public class count_digits_letters_and_special_characters_in_string {
    public static int[] fun(String s1){
        int[] counter = new int[3];

        for(int i = 0; i < s1.length(); i++){
            char digit = s1.charAt(i);

            if(Character.isDigit(digit)){
                counter[0]++;
            }
            else if(Character.isLetter(digit)){
                counter[1]++;
            }
            else{
                counter[2]++;
            }
        }

        return counter;
    }
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("count digits and letters and special characters in string");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        int[] counter = fun(s1);

        System.out.printf("%d digits, %d letters and %d special characters", counter[0], counter[1], counter[2]);

        sc.close();
    }
}
