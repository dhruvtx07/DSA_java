package practice.phase5.level2;
import java.util.Scanner;

public class count_how_many_strings_start_and_end_with_same_character {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("count how many substrings start and end with same character");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("enter character to check: ");
        char target = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        int counter = 0;

        for(char c : s1.toCharArray()){
            if(c == target){
                counter++;
            }
        }

        System.out.printf("\n %d substrings can be made out of %s", counter, s1);



        sc.close();
    }
}
