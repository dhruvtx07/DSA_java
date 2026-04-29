package practice.phase3.level2;
import java.util.Scanner;

public class number_to_binary_using_recursion {
    public static StringBuilder fun(int num, StringBuilder s1){
        if(num == 0){return s1;}
        fun(num/2, s1);
        int digit = num % 2;
        s1.append(digit);
        return s1;
    }

    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("number to binary using recursion");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        StringBuilder s1 = new StringBuilder();
        StringBuilder binary = new StringBuilder();
        binary.append(fun(num, s1));

        System.out.println(binary);
        sc.close();
    }
}
