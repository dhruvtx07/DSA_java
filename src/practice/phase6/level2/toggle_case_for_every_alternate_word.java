package practice.phase6.level2;
import java.util.Scanner;

public class toggle_case_for_every_alternate_word {
    public static void main(String[] args){
        System.out.println("toggle case for every alternate word");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        boolean upper = false;
        for(int i = 0; i<s1.length(); i++){
            char c = s1.charAt(i);
            if(c == ' '){
                System.out.print(" ");
                upper = !upper;
                continue;
            }
            if(!upper){
                System.out.print(c);
            }else{
                System.out.print(Character.toUpperCase(c));
            }
        }

        sc.close();
    }
}
