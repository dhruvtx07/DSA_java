package practice.phase2.level2;
import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("reverse number");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int tempNum = num;
        int newNum=0;
        int place;

        while(tempNum>0){
            place = tempNum % 10;
            newNum = newNum*10 + place;
            tempNum = tempNum/10;
        }

        System.out.printf("%d reverse number: %d", num, newNum);

        sc.close();
    }
}
