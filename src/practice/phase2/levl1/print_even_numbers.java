package practice.phase2.levl1;
import java.util.Scanner;

public class print_even_numbers {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("printing even numbers");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();
        for(int i =0; i<=num; i++){
            if(i%2 == 0){
                System.out.printf("%d\n", i);
            }
        }

        sc.close();
    }
}
