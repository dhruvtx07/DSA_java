package practice.phase3.level3;
import java.util.Scanner;

public class print_triangle_with_numbers_characters_using_recursion {
    public static void funColumn(int j, int columns){
        if(j > columns){
            return;
        }
        System.out.printf("%d ", j);
        funColumn(j+1, columns);
    }
    public static void fun(int i, int rows){
        if(i > rows){
            return;
        }
        funColumn(1, i);
        System.out.println();
        fun(i+1, rows);
    }
    public static void main(String[] args){
        System.out.println("------------------");
        System.out.println("print triangle of stars using recursion top down");
        System.out.println("------------------");

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        fun(1, n);


        sc.close();
    }
}
