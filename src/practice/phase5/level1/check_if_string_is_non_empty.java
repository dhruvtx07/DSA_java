package practice.phase5.level1;
import java.util.Scanner;

public class check_if_string_is_non_empty {
    public static boolean fun(String s1){
        for(int i = 0; i< s1.length(); i++){
            if(s1.charAt(i) != ' '){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("---------------");
        System.out.println("printing ASCII value for each character");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s1 = sc.nextLine();

        System.out.println();
        boolean flag = fun(s1);

        if(flag){
            System.out.println("non empty");
        }else{
            System.out.println("empty");
        }




        sc.close();
    }
}
