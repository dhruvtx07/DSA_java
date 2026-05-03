package practice.phase5.level4;
import java.util.*;

public class increase_each_character_by_one {
    public static void main(String[] args){
        System.out.println("increase each character by one\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        for(char c : s1.toCharArray()){
            System.out.printf("%c", c+1);
        }


        sc.close();
    }
}
