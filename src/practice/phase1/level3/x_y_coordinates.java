package practice.phase1.level3;
import java.util.Scanner;

public class x_y_coordinates {
    public static void main(String[] args){
        System.out.println("------------------");
        System.out.println("x y coordinates to quadrant");
        System.out.println("------------------");

        System.out.println("\n" +
                "If x > 0 and y > 0 → Quadrant I\n" +
                "If x < 0 and y > 0 → Quadrant II\n" +
                "If x < 0 and y < 0 → Quadrant III\n" +
                "If x > 0 and y < 0 → Quadrant IV");

        Scanner sc = new Scanner(System.in);

        System.out.println();

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        if(x>0 && y > 0){
            System.out.println("Quadrant I");
        }else if(x<0 && y > 0){
            System.out.println("Quadrant II");
        }else if(x<0 && y < 0){
            System.out.println("Quadrant III");
        }else{
            System.out.println("Quadrant IV -> x>0 && y<0");

        }

        sc.close();

    }
}
