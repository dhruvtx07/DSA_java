package practice.phase5.level5;
import java.util.*;

public class keep_only_one_space {
    public static void main(String[] args){
        System.out.println("keep only one space");

        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str = sc.nextLine();

        int idx = 0;
        while(idx<str.length()){
            char c = str.charAt(idx);
            if(c == ' '){
                if(str.charAt(idx+1) != ' '){
                    System.out.print(" ");
                    System.out.print(str.charAt(idx+1));
                    idx++;
                }
            }else{
                System.out.print(c);
            }
            idx++;
        }

        sc.close();
    }
}
