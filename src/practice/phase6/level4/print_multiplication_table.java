package practice.phase6.level4;
import java.util.Scanner;

public class print_multiplication_table {
    public static void main(String[] args){
        System.out.println("print multiplication table");
        Scanner sc  = new Scanner(System.in);

        System.out.print("enter number for table: ");
        int num = sc.nextInt();

        System.out.print("enter table till: ");
        int n = sc.nextInt();


        for(int i = 0; i<=n; i++){
            System.out.printf("%d x %d = %d\n", num, i, num*i);
        }

        sc.close();
    }
}
