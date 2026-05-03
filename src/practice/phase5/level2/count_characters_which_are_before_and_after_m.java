package practice.phase5.level2;
import java.util.Scanner;

public class count_characters_which_are_before_and_after_m {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("count characters which are before than m and less than m");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character: ");
        char target = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("Enter string: ");
        String s1 = sc.nextLine();

        int equal = 0;
        int lessThan = 0;
        int moreThan = 0;

        System.out.println();
        for(char c : s1.toCharArray()){
            System.out.print(c);
            if(c != ' '){
                if(c == target){
                    equal++;
                }else if(c<target){
                    lessThan++;
                }else{
                   moreThan++;
                }
            }

        }

        System.out.printf("\nless than %c - %d\nmore than %c - %d\nequal %c - %d", target, lessThan, target, moreThan, target, equal);


        sc.close();
    }
}
