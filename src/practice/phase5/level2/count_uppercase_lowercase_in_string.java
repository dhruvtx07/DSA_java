package practice.phase5.level2;
import java.util.Scanner;

public class count_uppercase_lowercase_in_string {
    public static int[] fun(String s1){
        int[] counter = new int[2];

        for(int i = 0; i<s1.length(); i++){
            if(Character.isLetter(s1.charAt(i))){
                if(s1.charAt(i) >='A' && s1.charAt(i) <='Z'){
                    counter[0]++;
                }else{
                    counter[1]++;
                }
            }
        }

        return counter;
    }
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("count uppercase and lowercase in string");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter something: ");
        String s1 = sc.nextLine();

        int[] counter = fun(s1);

        System.out.printf("%d uppercase and %d lowercase", counter[0], counter[1]);

        sc.close();
    }
}
