package practice.phase5.level3;
import java.util.Scanner;

public class print_second_half_of_string {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("print second half os string");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        System.out.println("Printing second half of string using loop");
        for(int i = s1.length()/2; i<s1.length(); i++){
            System.out.print(s1.charAt(i));
        }

        System.out.println("\nPrinting second half of substring using substring");

        String s2 = s1.substring(s1.length()/2,s1.length());
        System.out.print(s2);

        sc.close();
    }
}
