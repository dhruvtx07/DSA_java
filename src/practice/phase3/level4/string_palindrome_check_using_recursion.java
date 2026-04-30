package practice.phase3.level4;
import java.util.Scanner;

public class string_palindrome_check_using_recursion {
    public static boolean fun(int low, int high, String s1){
        int length = high - low + 1;
        if(length == 0 || length == 1){
            return true;
        }
        if(s1.charAt(low) != s1.charAt(high)){
            return false;
        }
        return fun(low+1, high -1, s1);
    }
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("string palindrome check using recursion");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter something: ");
        String s1 = sc.next();

        boolean result = fun(0, s1.length()-1, s1);
        System.out.println(result);

        sc.close();
    }
}
