package practice.phase6.level5;

import java.util.Scanner;

public class count_how_many_prime_numbers_are_there_in_array {
    public static void main(String[] args){
        System.out.println("count how many prime numbers are there in array");
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];
        for(int i =0; i<arr1.length; i++){
            System.out.printf("enter value for %d position: ", i+1);
            arr1[i] = sc.nextInt();
        }

        for(int i =0; i<arr1.length; i++){
            int num = arr1[i];
            if(num<=1){
                System.out.printf("%d - non prime\n", num);
            }else{
                boolean isPrime = true;
                for(int j = 2; j*j<=num; j++){
                    if(num % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(!isPrime){
                    System.out.printf("%d - non prime\n", num);
                }else{
                    System.out.printf("%d - prime\n", num);
                }
            }
        }



        sc.close();
    }
}
