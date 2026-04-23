package practice.phase1.level2;
import java.util.Scanner;

public class type_of_triangle {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("type of triangle");
        System.out.println("---------------");


        System.out.print("Enter three sides of triangle: ");

        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();


        if((side1<side2+side3)&&(side2<side1+side2)&&(side3<side1+side2)){
            System.out.println("Valid Triangle");
            if((side1 == side2 && side2==side3)){System.out.println("equilateral Triangle");}
            else if((side1==side2)||(side2==side3) || (side3==side1)){System.out.println("isosceles Triangle");}
            else{System.out.println("scalene Triangle");}

        }else{
            System.out.println("Invalid Triangle");
        }

        sc.close();
    }
}
