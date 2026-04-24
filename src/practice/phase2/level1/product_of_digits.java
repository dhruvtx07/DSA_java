package practice.phase2.level1;
import java.util.Scanner;

public class product_of_digits {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("product of digits");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int tempNum = num;
        int productOfDigits = 1;

        while(tempNum>0){
            productOfDigits *= tempNum % 10;
            tempNum= tempNum/10;
        }

        System.out.printf("%d product of digits = %d", num, productOfDigits);

        sc.close();
    }
}
