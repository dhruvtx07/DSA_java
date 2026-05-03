package practice.phase5.level3;
import java.util.Scanner;

public class reverse_string_but_skip_spaces {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("reverse string skipping spaces");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);


        System.out.print("enter string: ");
        String s1 = sc.nextLine();
        for(int i = s1.length()-1; i>=0; i--){
            if(s1.charAt(i) != ' '){
                System.out.print(s1.charAt(i));
            }
        }

        sc.close();
    }
}
