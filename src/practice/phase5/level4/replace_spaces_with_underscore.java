package practice.phase5.level4;
import java.util.*;

public class replace_spaces_with_underscore {
    public static void main(String[] args){
        System.out.println("replace spaces with underscore\n\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = sc.nextLine();
        StringBuilder str = new StringBuilder(s1);

        System.out.println("before string");
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                str.setCharAt(i, '_');
            }
        }

        System.out.println("\nafter string");
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }

        sc.close();
    }
}
