package practice.phase3.level3;
import java.util.Scanner;

public class print_table_multiplication_using_recursion {
    public static void table(int i, int num, int n){
        if(i>n){
            return;
        }
        System.out.printf("%d x %d = %d", num, i, num*i);
        System.out.println();
        table(i+1, num, n);
    }
    public static void main(String[] args){
        System.out.println("------------------");
        System.out.println("Printing table using recursion");
        System.out.println("------------------");


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter table till: ");
        int n = sc.nextInt();

        table(0, num, n);

        sc.close();
    }
}
