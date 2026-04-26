package practice.phase2.level4;
import java.util.Scanner;

public class print_n_stars {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("print n stars");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of stars: ");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            System.out.printf("* ");
        }

        sc.close();
    }
}
