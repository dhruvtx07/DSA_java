package practice.phase2.level5;
import java.util.Scanner;

public class one_to_n_binary_representation_which_are_having_even_number_of_one {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("checking numbers from 1 to n whose binary representation is having even number of 1s");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter last number: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            int tempNum = i;
            int binaryNum = 0;
            int counter = 0;
            int actualBinaryNum = 0;


            while(tempNum>0){
                int digit = tempNum % 2;
                binaryNum = binaryNum * 10 + digit;
                tempNum /= 2;
            }
            while(binaryNum>0){
                int digit = binaryNum % 10;
                if(digit == 1){
                    counter++;
                }
                actualBinaryNum = actualBinaryNum * 10 + digit;
                binaryNum /= 10;
            }
            if(counter % 2 == 0){
                System.out.printf("%d -> %d is having even number of ones\n", i, actualBinaryNum);
            }else{
                System.out.printf("%d -> %d\n", i, actualBinaryNum);
            }



        }

        sc.close();
    }
}
