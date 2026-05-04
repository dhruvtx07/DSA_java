package practice.phase5.level5;
import java.util.*;

public class print_string_in_lettercase {
    public static void main(String[] args){
        System.out.println("print lettercase string");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String str = sc.nextLine();

        System.out.println("\nprinting string in lettercase: ");
        for(int i = 0; i<str.length(); i++){
            if(i==0){
                System.out.print(Character.toUpperCase(str.charAt(i)));
            }else{
                System.out.print(str.charAt(i));
            }
        }

        sc.close();
    }
}
