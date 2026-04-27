package practice.phase3.level1;
import java.util.Scanner;

public class print_even_numbers_1_to_n_using_recursion {
    public static void print(int i, int n){
        if(i>n){
          return;
        }
        if(i%2==0){
            System.out.printf("%d ", i);
        }
        print(i+1, n);
    }
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("Print even numbers 1 to n using recursion");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        print(1, n);

        sc.close();
    }
}
