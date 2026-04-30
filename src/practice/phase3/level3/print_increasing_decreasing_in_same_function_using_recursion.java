package practice.phase3.level3;
import java.util.Scanner;

public class print_increasing_decreasing_in_same_function_using_recursion {
    public static void fun(int i, int n){
        if(i>n){
            System.out.println();
            return;
        }
        System.out.printf("%d ", i);
        fun(i+1, n);
        System.out.printf("%d ", i);
    }
    public static void main(String[] args){
        System.out.println("------------------");
        System.out.println("Printing increasing and decreasing in the same function");
        System.out.println("------------------");


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        fun(0, n);

        sc.close();
    }
}
