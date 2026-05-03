package practice.phase5.level4;
import java.util.*;

public class remove_consecutive_duplicates {
    public static void main(String[] args){
        System.out.println("remove consecutive duplicates\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        HashSet<Character> seen = new HashSet<>();
        StringBuilder str = new StringBuilder();

        for(int i = 0; i<s1.length(); i++){
            if(!seen.contains(s1.charAt(i))){
                seen.add(s1.charAt(i));
                str.append(s1.charAt(i));
            }
        }

        System.out.println(str);


        sc.close();
    }
}
