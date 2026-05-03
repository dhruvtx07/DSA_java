package practice.phase5.level4;
import java.util.*;

public class swap_case {
    public static void main(String[] args){
        System.out.println("swap case\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        StringBuilder str = new StringBuilder(s1);

        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c<='Z' && c>='A'){
                char lower = Character.toLowerCase(c);
                str.setCharAt(i, lower);
            }else{
                char upper = Character.toUpperCase(c);
                str.setCharAt(i, upper);
            }
        }

        System.out.println("after string: ");
        for(int i = 0; i<str.length();i++){
            System.out.print(str.charAt(i));
        }

        sc.close();
    }
}
