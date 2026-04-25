package practice.phase2.level3;
import java.util.Scanner;

public class first_n_terms_gp {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("GP series");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term: ");
        int a = sc.nextInt();

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.print("Enter gap ratio: ");
        int r = sc.nextInt();

        System.out.printf("%d , ", a);

        for(int i =1; i< n; i++){
            a = a * r;
            System.out.printf("%d , ", a);
        }

    }
}
