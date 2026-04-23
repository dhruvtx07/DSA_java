package practice.phase1.level2;
import java.util.Scanner;

public class valid_triangle {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("Valid triangles");
        System.out.println("---------------");


        System.out.print("Enter three sides of triangle: ");

        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();


        if((side1<side2+side3)&&(side2<side1+side2)&&(side3<side1+side2)){
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Invalid Triangle");
        }

        sc.close();
    }
}
