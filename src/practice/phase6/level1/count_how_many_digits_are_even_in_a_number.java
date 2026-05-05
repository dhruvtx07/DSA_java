package practice.phase6.level1;
import java.util.*;

public class count_how_many_digits_are_even_in_a_number {
    public static void main(String[] args){
        System.out.println("count how many digits are even");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number: ");
        int num = sc.nextInt();

        int temp = num;
        int counter = 0;

        while(temp>0){
            int digit = temp % 10;
            if(digit%2==0){
                counter++;
            }
            temp/=10;
        }

        System.out.println(counter);

        sc.close();
    }
}
