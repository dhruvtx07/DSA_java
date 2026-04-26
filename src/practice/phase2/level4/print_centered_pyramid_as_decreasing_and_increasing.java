package practice.phase2.level4;
import java.util.Scanner;
public class print_centered_pyramid_as_decreasing_and_increasing {
    public static void main(String[] args){
        System.out.println("-----------------");
        System.out.println("Printing centered pyramid as decreasing and increasing");
        System.out.println("-----------------");

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int rows = n; rows>=1; rows--){
            for(int gap=1; gap<= rows-1; gap++){
                System.out.printf(" ");
            }
            for(int column = n; column>=rows; column--){
                System.out.printf("%d", column);
            }
            for(int columnInc = rows+1; columnInc<=n; columnInc++){
                System.out.printf("%d",columnInc);
            }
            System.out.println();
        }

        sc.close();

    }
}
