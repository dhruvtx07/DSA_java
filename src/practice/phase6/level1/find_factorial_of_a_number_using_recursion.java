package practice.phase6.level1;
import java.util.*;

public class find_factorial_of_a_number_using_recursion {
    public static int fun(int num){
        if(num == 1 || num == 0){
            return 1;
        }

        return num * fun(num-1);
    }
    public static void main(String[] args){
        System.out.println("finding factorial using recursion");
        Scanner sc= new Scanner(System.in);

        System.out.print("enter number: ");
        int num = sc.nextInt();

        int factorial = fun(num);
        System.out.printf("%d! = %d", num, factorial);


        sc.close();
    }
}
