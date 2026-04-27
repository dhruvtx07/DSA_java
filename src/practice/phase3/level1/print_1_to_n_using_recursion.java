package practice.phase3.level1;
import java.util.Scanner;

public class print_1_to_n_using_recursion {
    public static void print(int i, int n){
        if(i > n){
            return;
        }
        System.out.println(i);
        print(i+1, n);
    }

    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("print 1 to n");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter last number: ");
        int n = sc.nextInt();

        print(1, n);

        sc.close();
    }
}
