package practice.phase5.level3;
import java.util.Scanner;

public class palindrome_checker {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("palindrome checker string");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        boolean flag = false;
        int low = 0;
        int high = s1.length()-1;


        int length = s1.length();
        if(length<=1){
            flag = true;
        }else{
            while(low<high){
                if(s1.charAt(low) == s1.charAt(high)){
                    flag = true;
                    low++;
                    high--;
                }else{
                    flag = false;
                    break;
                }
            }

        }

        if(flag){
            System.out.println("string is palindrome");
        }else{
            System.out.println("string is not palindrome");
        }
        sc.close();
    }
}
