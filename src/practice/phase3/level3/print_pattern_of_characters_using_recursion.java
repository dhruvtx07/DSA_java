package practice.phase3.level3;
import java.util.Scanner;

public class print_pattern_of_characters_using_recursion {
    public static void funColumns(int j, int columns, char c){
        if(j > columns){
            return;
        }
        System.out.printf("%c ", c);
        funColumns(j+1, columns, ++c);
    }

    public static void funRows(int i, int n){
        if(i > n){
            return;
        }
        funColumns(1, i, 'A');
        System.out.println();
        funRows(i+1, n);
    }

    public static void main(String[] args){
        System.out.println("-------------");
        System.out.println("print triangle as characters");
        System.out.println("-------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        funRows(1, n);

        sc.close();

    }
}
