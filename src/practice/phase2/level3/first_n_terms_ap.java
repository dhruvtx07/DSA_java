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

        for(int i = 1; i<= n; i++){
            int num = a + ((i-1)*d);
            System.out.printf("%d ,", num);
        }



        sc.close();
    }
}
