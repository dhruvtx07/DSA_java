package practice.phase6.level1;
import java.util.*;

public class print_numbers_1_to_n_divisible_by_3_and_5 {
    public static void main(String[] args){
        System.out.println("checking numbers 1 to n divisible by both 3 and 5\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter n: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.printf("%d, ", i);
            }
        }

        sc.close();
    }
}
