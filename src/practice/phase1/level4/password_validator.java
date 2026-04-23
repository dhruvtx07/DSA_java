package practice.phase1.level4;
import java.util.Scanner;

public class password_validator {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("password validator");
        System.out.println("----------------");

        System.out.print("Enter a password to validate: ");
        Scanner sc = new Scanner(System.in);
        String password = sc.next();

        System.out.println();
        boolean flag1 = false;
        boolean flag2 = false;


        if(password.length()>=8){
            for(char c : password.toCharArray()){
                if(c >= '0' && c<= '9'){
                    flag1 = true;
                }
                if(Character.isDigit(c)){
                    flag2 = true;
                    break;
                }
            }
            if(flag1 == flag2){
                System.out.println("password is valid");
            }
        }else{
            System.out.println("invalid password");
        }


        sc.close();
    }
}
