package practice.phase3.level3;
import java.util.Scanner;

public class print_line_of_stars_using_recursion {
    public static void fun(int rows){
        if(rows == 0){
            return;
        }
        System.out.println("* * * * *");
        fun(rows-1);
    }
    public static void main(String[] args){
        System.out.println("------------------");
        System.out.println("print line of stars using recursion");
        System.out.println("------------------");

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        fun(rows);


        sc.close();
    }
}
