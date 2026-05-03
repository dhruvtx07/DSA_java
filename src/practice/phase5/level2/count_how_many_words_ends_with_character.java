package practice.phase5.level2;
import java.util.Scanner;

public class count_how_many_words_ends_with_character {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("count how many words in a string ends with characterl");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character: ");
        char target = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        int counter = 0;
        for(int i =0; i<s1.length(); i++){
            System.out.print(s1.charAt(i));
            if(i == s1.length()-1){
                if(Character.toUpperCase(s1.charAt(i)) == Character.toUpperCase(target)){
                    counter++;
                }
            }

            if(s1.charAt(i) == ' '){
                if(Character.toUpperCase(s1.charAt(i-1)) == Character.toUpperCase(target)){
                    counter++;
                }
            }

        }

        System.out.printf("\n%d words ends with %c", counter, target);
        sc.close();
    }
}
