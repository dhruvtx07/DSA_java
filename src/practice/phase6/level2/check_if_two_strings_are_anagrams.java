package practice.phase6.level2;
import java.util.*;

public class check_if_two_strings_are_anagrams {
    public static void main(String[] args){
        System.out.println("check if two strings are anagram");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string1: ");
        String s1 = sc.nextLine();

        System.out.print("enter string2: ");
        String s2 = sc.nextLine();

        boolean same = false;
        if(s1.length() == s2.length()){
            for(int i = 0; i<s1.length(); i++){
                for(int j = 0; j<s2.length(); j++){
                    if(s1.charAt(i) == s2.charAt(j)){
                        same = true;
                    }
                }
                if(!same){
                    break;
                }
                if(i != s1.length()-1){
                    same = false;
                }
            }
        }

        if(!same){
            System.out.print("not anagram");
        }else{
            System.out.print("valid anagram");
        }




        sc.close();
    }
}
