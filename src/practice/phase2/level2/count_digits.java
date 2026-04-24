package practice.phase2.level2;
import java.util.Scanner;

public class count_digits {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("count digits");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int tempNum = num;
        int counter = 0;

        while(tempNum>0){
            tempNum = tempNum/10;
            counter++;
        }

        System.out.printf("%d product of digits = %d", num, counter);

        sc.close();
    }
}
