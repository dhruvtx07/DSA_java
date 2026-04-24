package practice.phase2.levl1;
import java.util.Scanner;

public class print_tables {
    public static void main(String[] args){

        System.out.println("----------------");
        System.out.println("printing tables");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println();
        for(int i = 0; i<=num; i++){
            System.out.printf("table of %d\n", i);
            for(int j = 0; j<=10; j++){
                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }
            System.out.println();
        }

        sc.close();
    }
}
