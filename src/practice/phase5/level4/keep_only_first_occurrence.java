package practice.phase5.level4;
import javax.print.DocFlavor;
import java.util.*;

public class keep_only_first_occurrence {
    public static void main(String[] args){
        System.out.println("keeping only the first occurrences of any character\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        StringBuilder str = new StringBuilder();


        for(int i =0; i<s1.length(); i++){
            char c = s1.charAt(i);
            boolean seen = false;

            for(int j = 0; j<str.length(); j++){
                if(c == str.charAt(j)){
                    seen = true;
                }
            }
            if(!seen){
                str.append(c);
            }

        }


        System.out.println("after string: ");
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }

        sc.close();
    }
}
