package practice.phase2.level2;
import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("palindrome number");
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
        if(num == newNum){
            System.out.printf("palindrome number %d = %d", num, newNum);
        }else{
            System.out.println("invalid");
        }



        sc.close();
    }
}
