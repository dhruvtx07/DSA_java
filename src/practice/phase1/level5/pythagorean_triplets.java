package practice.phase1.level5;
import java.util.Scanner;


public class pythagorean_triplets {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("Pythagorean triplet checker");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if(c > a && c > b){
            if(((a*a)+(b*b)) == c*c){
                System.out.println("pythagorean triplets");
            }else{
                System.out.println("nothing");
            }
        }else{
            System.out.println("invalid sequence entered");
        }

        sc.close();

    }
}
