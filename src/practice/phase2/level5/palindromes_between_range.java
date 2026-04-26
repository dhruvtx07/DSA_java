package practice.phase2.level5;
import java.util.Scanner;

public class palindromes_between_range {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("printing palindrome numbers");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter last number: ");
        int last = sc.nextInt();

        for(int i = first; i<=last; i++){

            int tempNum = i;
            int newNum = 0;
            while(tempNum>0){
                int digit = tempNum % 10;
                newNum = newNum * 10 + digit;
                tempNum /= 10;
            }
            if(newNum == i){
                System.out.printf("%d is palindrome \n", newNum);
            }
        }

        sc.close();
    }
}
