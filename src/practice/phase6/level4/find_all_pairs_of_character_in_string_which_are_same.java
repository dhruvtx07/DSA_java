package practice.phase6.level4;
import java.util.*;

public class find_all_pairs_of_character_in_string_which_are_same {
    public static void main(String[] args){
        System.out.println("find out characters which are same");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        for(int i = 0; i<s1.length(); i++){
            for(int j = 0; j<s1.length(); j++){
                char a = s1.charAt(i);
                char b = s1.charAt(j);

                if(i != j){
                    if(a == b){
                      System.out.printf("%c == %c\n", a, b);
                    }
                }

            }

            }

        sc.close();
    }
}
