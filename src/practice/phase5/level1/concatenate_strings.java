package practice.phase5.level1;
import java.util.Scanner;

public class concatenate_strings {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("concatenate strings manually");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("enter string 1: ");
        String str1 = sc.nextLine();

        System.out.print("enter string 2: ");
        String str2 = sc.nextLine();


        System.out.println("concatenated manually via + operator");
        String str3 = str1 + str2;
        for(char c : str3.toCharArray()){
            System.out.print(c);
        }


        System.out.println("\nconcatenated via str1.concat(str2)");
        String str4 = str1.concat(str2);
        for(char c : str4.toCharArray()){
            System.out.print(c);
        }



        sc.close();
    }
}
