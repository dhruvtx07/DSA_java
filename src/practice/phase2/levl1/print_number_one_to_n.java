package practice.phase2.levl1;
import java.util.Scanner;

public class print_number_one_to_n {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("printing numbers");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();
        for(int i =1; i<=num; i++){
            System.out.printf("%d\n", i);
        }

        sc.close();
    }
}
