package practice.phase6.level5;
import java.util.*;

public class print_frequency_of_each_digit_in_number {
    public static void main(String[] args){
        System.out.println("print frequency of each digit");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        ArrayList<Integer> digits = new ArrayList<>();
        while(temp>0){
            int digit = temp % 10;
            digits.add(digit);
            temp/=10;
        }

        for(int i = 0; i< digits.size(); i++){
            int a = digits.get(i);
            int counter = 0;
            for(int j = 0; j< digits.size(); j++){
                int b = digits.get(j);
                if(a==b){
                    counter++;
                }
            }
            System.out.printf("%d - %d times\n", a, counter);
        }

        sc.close();
    }
}
