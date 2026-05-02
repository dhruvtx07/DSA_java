package practice.phase5.level2;
import java.util.*;

public class find_frequency_of_each_character {

    public static int[] fun(String s1){
        int[] counter = new int[s1.length()];

        for(int i = 0; i<s1.length(); i++){
            for(int j = 0; j<s1.length(); j++){
                if(s1.charAt(i) == s1.charAt(j)){
                    counter[i]++;
                }
            }
        }

        return counter;
    }

    public static void main(String[] args){
        System.out.println("-----------------");
        System.out.println("finding frequency of each chraracter");
        System.out.println("-----------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("enter a string: ");
        String s1 = sc.nextLine();

        int[] counter = fun(s1);
        System.out.println();
        System.out.println();
        for(int i = 0; i<s1.length(); i++){
            System.out.printf("%c - frequency %d\n", s1.charAt(i), counter[i]);
        }


        sc.close();
    }
}
