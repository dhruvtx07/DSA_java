package practice.phase3.level2;
import java.util.Scanner;

public class number_to_words_using_recursion {
    public static void word(int n){
        switch(n){
            case 1: System.out.print("one "); break;
            case 2: System.out.print("two "); break;
            case 3: System.out.print("three "); break;
            case 4: System.out.print("four "); break;
            case 5: System.out.print("five "); break;
            case 6: System.out.print("six "); break;
            case 7: System.out.print("seven "); break;
            case 8: System.out.print("eight "); break;
            case 9: System.out.print("nine "); break;
            case 0: System.out.print("zero "); break;
            default: System.out.print("invalid "); break;
        }
        return;
    }
    public static void fun(int num){
        if(num == 0){
            return;
        }
        fun(num/10);
        int digit = num % 10;
        word(digit);
    }
    public static void main(String[] args){
        System.out.println("-----------------");
        System.out.println("Number to words using recursion");
        System.out.println("-----------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        fun(num);
        sc.close();
    }
}
