package practice.phase6.level5;
import java.util.*;

public class print_common_characters_in_two_strings {
    public static void main(String[] args){
        System.out.println("print common characters in two strings");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string 1: ");
        String s1 = sc.nextLine();

        System.out.print("enter string 2: ");
        String s2 = sc.nextLine();


        for(int i =0; i<s1.length(); i++) {
            char a  = s1.charAt(i);
            for (int j = 0; j < s2.length(); j++) {
                char b = s2.charAt(j);
                if(i!=j){
                    if(a==b){
                        System.out.println(a);
                    }
                }
            }
        }

        sc.close();
    }
}
