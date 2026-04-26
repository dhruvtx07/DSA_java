package practice.phase2.level4;
import java.util.Scanner;

public class triangle_increasing_number_of_stars {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("Triangle 1 - increasing number of stars");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int n = sc.nextInt();

        for(int rows =1; rows<= n; rows++){
            for(int columns = 1; columns<= rows; columns++){
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
