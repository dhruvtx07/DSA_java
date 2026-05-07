package practice.phase6.level5;
import java.util.Scanner;

public class check_if_password_is_valid {
    public static void main(String[] args){
        System.out.println("password validator");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter password: ");
        String s1 = sc.nextLine();

        boolean lowercase = false;
        boolean uppercase = false;
        boolean digit = false;
        boolean special_char = false;

        for(int i = 0; i<s1.length(); i++){
            char c = s1.charAt(i);
            if(Character.isDigit(c)){
                digit = true;
            }else if(Character.isLetter(c)){
                if(Character.toUpperCase(c) == c){
                    uppercase = true;
                }else{
                    lowercase = true;
                }
            }else{
                special_char = true;
            }
        }

        if(lowercase && uppercase && digit && special_char){
            System.out.println("password is valid");
        }else{
            System.out.println("password is invalid");
            if(!lowercase){
                System.out.println("no lowercase letter found");
            }
            if(!uppercase){
                System.out.println("no uppercase letter found");
            }
            if(!digit){
                System.out.println("no digit found");
            }
            if(!special_char){
                System.out.println("no special character found");
            }
        }

    }
}
