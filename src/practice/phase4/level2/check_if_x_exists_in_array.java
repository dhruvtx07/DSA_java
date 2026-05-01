package practice.phase4.level2;
import java.util.Scanner;

public class check_if_x_exists_in_array {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("check if x exists in array");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        int[] nums = {1, 2, 3, 4, 5};

        for(int i : nums){
            System.out.printf("%d - ", i);
            if(i == x){
               System.out.printf("matched");
            }
            System.out.println();
        }

        sc.close();
    }
}
