package practice.phase5.level3;
import java.util.Scanner;

public class print_string_without_first_and_last_character {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.println("print string without first and las character");
        System.out.println("--------------------");

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        System.out.println("printing string with loop except first and last character\n");
        if(s1.length()<=2){
            System.out.print("string length is too short\n");
        }else{
            for(int i = 1; i<=s1.length()-2; i++){
                System.out.print(s1.charAt(i));
            }
        }
        System.out.printf("\nprinting string using substring except first and last character \n%s", s1.substring(1, s1.length()-1));



        sc.close();
    }
}
