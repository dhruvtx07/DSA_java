package practice.phase5.level3;
import java.util.Scanner;

public class print_middle_character_of_string {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("print middle of string");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String s1 = sc.nextLine();

        char mid = ' ';
        int length = s1.length();

        if(length==0){
            System.out.println("string is empty");
        }else{
            if(length%2!=0){
                mid = s1.charAt(length/2);
            }else{
                mid = s1.charAt((length/2)-1);
            }
        }

        System.out.printf("mid %c of %s", mid, s1);

        sc.close();
    }
}
