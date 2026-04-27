package practice.phase3.level1;
import java.util.Scanner;

public class print_n_to_1_using_recursion {
    public static void print(int n, int i){
        if(n<i){
          return;
        }
        System.out.println(n);
        print(n-1, i);
    }
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("Print N to 1 using recursion");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        print(n, 1);

        sc.close();
    }
}
