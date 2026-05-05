package practice.phase6.level2;
import java.util.*;

public class check_if_two_strings_are_rotations_of_each_other {
    public static void main(String[] args){
        System.out.println("check if two strings are rotations of each other");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter string2: ");
        String s2 = sc.nextLine();

        boolean same = false;
        ArrayList<Integer> idx = new ArrayList<>();
        if(s1.length() == s2.length()){
            for(int i = 0; i<s1.length(); i++){
                same = false;
                for(int j = 0; j<s2.length(); j++){
                    if(idx.contains(j)){
                       continue;
                    }
                    if(s1.charAt(i) == s2.charAt(j)){
                        same = true;
                        idx.add(j);
                    }
                }
            }
        }
        if(same){
            System.out.print("rotations true");
        }else{
            System.out.print("rotations false");
        }


        sc.close();
    }
}
