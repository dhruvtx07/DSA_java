package practice.phase5.level5;
import java.util.*;

public class capitalize_first_character_of_each_word {
    public static void main(String[] args){
        System.out.println("capitalize first character of each word");

        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String str = sc.nextLine();

        System.out.println("before string: ");
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }

        System.out.println("\nafter string: ");
        boolean newWord = false;
        for(int i = 0; i<str.length(); i++){
            if(i == 0 ){
                System.out.print(Character.toUpperCase(str.charAt(i)));
            }else if (str.charAt(i) == ' '){
                System.out.print(Character.toUpperCase(str.charAt(i)));
                System.out.print(Character.toUpperCase(str.charAt(i+1)));
                newWord = true;
            }else{
                if(!newWord){
                    System.out.print(str.charAt(i));
                }
                newWord = false;
            }
        }


        sc.close();
    }
}
