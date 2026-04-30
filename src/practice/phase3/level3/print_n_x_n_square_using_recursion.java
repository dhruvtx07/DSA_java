package practice.phase3.level3;
import java.util.Scanner;

public class print_n_x_n_square_using_recursion {
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
        fun(rows-1, columns);

    }
    public static void main(String[] args){
        System.out.println("------------------");
        System.out.println("print n x n stars square using recursion");
        System.out.println("------------------");

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        fun(n, n);


        sc.close();
    }
}
