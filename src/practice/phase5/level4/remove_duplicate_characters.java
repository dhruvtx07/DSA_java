package practice.phase5.level4;
import java.util.*;

public class remove_duplicate_characters {
    public static void main(String[] args){
        System.out.println("remove duplicate characters from string\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        int count = 0;
        for(int i = 0; i<s1.length(); i++){
            for(int j = 0; j<s1.length(); j++){
                if(s1.charAt(i) == s1.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.print(s1.charAt(i));
            }
            count=0;
        }

        sc.close();
    }
}
