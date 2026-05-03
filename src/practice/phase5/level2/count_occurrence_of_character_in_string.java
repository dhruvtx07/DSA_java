package practice.phase5.level2;
import java.util.Scanner;

public class count_occurrence_of_character_in_string {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("count occurrence of character in string");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);


        System.out.print("enter character: ");
        char target = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        int count = 0;
        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i) == target){
                System.out.printf("%d, ", i);
                count++;
            }
        }

        System.out.printf("\n%c occurred %d times", target, count);

        sc.close();
    }
}
