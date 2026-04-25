package practice.phase2.level3;
import java.util.Scanner;

public class first_n_terms_ap {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("AP series");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting term: ");
        int a = sc.nextInt();

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.print("Enter gap between terms: ");
        int d = sc.nextInt();

        System.out.printf("%d ,", a);

        for(int i = 1; i< n; i++){
            a = a + d;
            System.out.printf("%d ,", a);
        }



        sc.close();
    }
}
