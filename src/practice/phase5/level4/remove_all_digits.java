package practice.phase5.level4;
import java.util.*;

public class remove_all_digits {
    public static void main(String[] args){
        System.out.println("remove all digits from string\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String s1 = sc.nextLine();
        StringBuilder str = new StringBuilder(s1);


        System.out.println("before string: ");
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }

        for(int i = 0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                str.deleteCharAt(i);
                i--;
            }
        }


        System.out.println("\nafter string: ");
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }

        sc.close();
    }
}
