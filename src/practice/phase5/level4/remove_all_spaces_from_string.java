package practice.phase5.level4;
import java.util.*;

public class remove_all_spaces_from_string {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        StringBuilder str = new StringBuilder(s1);

        System.out.println("before");
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }

        System.out.println();

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                str.deleteCharAt(i);
                i--;
            }
        }

        System.out.println("after");
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }


        sc.close();
    }
}
