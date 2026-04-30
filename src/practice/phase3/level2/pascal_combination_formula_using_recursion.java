package practice.phase3.level2;
import java.util.Scanner;

public class pascal_combination_formula_using_recursion {
    public static int fun(int n, int r){
        if(r == 0 || r == n){
            return 1;
        }
        return fun(n-1, r-1) + fun(n-1, r);
    }

    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("pascal combination using recursion");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        System.out.print("Enter number of choices: ");
        int r = sc.nextInt();



        int ans = fun(n, r);
        System.out.println();
        System.out.println(ans);


        sc.close();
    }
}
