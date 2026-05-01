package practice.phase4.level2;
import java.util.Scanner;

public class count_number_of_occurrences {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("count number of occurrences of x in array");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        int[] nums = new int[5];
        int counter = 0;

        for(int i : nums){
            System.out.printf("Enter element: ", i);
            i = sc.nextInt();
            if(i == x){
                counter += 1;
            }
        }
        System.out.println(counter);
        sc.close();
    }
}
