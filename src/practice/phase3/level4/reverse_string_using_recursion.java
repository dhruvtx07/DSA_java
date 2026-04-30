package practice.phase3.level4;
import java.util.Scanner;

public class reverse_string_using_recursion {
    public static void rev(int i, int n, String s1){
        if(i == n){
            return;
        }
        rev(i+1, n, s1);
        System.out.printf("%s",s1.charAt(i));
    }
    public static void main(String[] args){
        System.out.println("-----------------");
        System.out.println("reverse a string using recursion");
        System.out.println("-----------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter something: ");
        String s1 = sc.next();
        rev(0, s1.length(), s1);



        sc.close();
    }

}
