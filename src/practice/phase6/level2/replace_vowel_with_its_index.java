package practice.phase6.level2;
import java.util.*;

public class replace_vowel_with_its_index {
    public static void main(String[] args){
        System.out.println("replace vowel with its index");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string ");
        String s1 = sc.nextLine();

        StringBuilder str = new StringBuilder(s1);
        for(int  i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            char x = (char)(i+ '0');
            if('A' == Character.toUpperCase(c) || 'E' == Character.toUpperCase(c) || 'I' == Character.toUpperCase(c) || 'O' == Character.toUpperCase(c) || 'U' == Character.toUpperCase(c)){
                str.setCharAt(i, x);
            }
        }
        System.out.print(str);

        sc.close();
    }
}
