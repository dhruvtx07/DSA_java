package practice.phase3.level2;
import java.util.Scanner;

public class product_of_digits_using_recursion {
    public static int productOfDigits(int num, int product){
        if(num==0){
            return product;
        }
        int digit = num%10;
        return productOfDigits(num/10, product * digit);
    }
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("product of digits using recursion");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int product = productOfDigits(num, 1);
        System.out.println();
        System.out.println(product);

        sc.close();
    }
}
