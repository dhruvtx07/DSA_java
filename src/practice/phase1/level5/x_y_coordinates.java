package practice.phase1.level5;
import java.util.Scanner;

public class x_y_coordinates {
    public static void main(String[] args){
        System.out.println("------------------");
        System.out.println("x y coordinates");
        System.out.println("------------------");


        Scanner sc = new Scanner(System.in);

        System.out.println();

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        if(x == 0 && y == 0){
            System.out.println("origin");
        }else{
            if(x == 0 ){
                System.out.println("x axis");
            }else if(y == 0){
                System.out.println("y axis");
            }else{
                System.out.println("nothing");
            }
        }

        sc.close();

    }
}
