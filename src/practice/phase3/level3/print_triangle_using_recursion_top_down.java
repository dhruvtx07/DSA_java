package practice.phase3.level3;
import java.util.Scanner;

public class print_triangle_using_recursion_top_down {
    public static void funColumn(int columns){
        if(columns == 0){
            return;
        }
        System.out.print("* ");
        funColumn(columns-1);
    }
    public static void fun(int rows, int columns){
        if(rows == 0){
            return;
        }
        funColumn(columns);
        System.out.println();
        fun(rows-1, columns-1);
    }
    public static void main(String[] args){
        System.out.println("------------------");
        System.out.println("print triangle of stars using recursion top down n to 1");
        System.out.println("------------------");

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        fun(n, n);


        sc.close();
    }
}
