package practice.phase3.level2;
import java.util.Scanner;

public class count_number_of_digits {

    public static int count(int num){
        if(num==0){
            return 0;
        }
        return 1 + count(num/10);
    }
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("count digits using recursion");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = count(num);
        System.out.println(sum);

        sc.close();
    }
}
