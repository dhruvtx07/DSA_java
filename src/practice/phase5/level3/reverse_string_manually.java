package practice.phase5.level3;
import java.util.Scanner;

public class reverse_string_manually {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("reverse string");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = sc.nextLine();


        System.out.println("reversing string");
        for(int i = s1.length()-1; i>=0; i--){
            System.out.print(s1.charAt(i));
        }


        sc.close();
    }
}
