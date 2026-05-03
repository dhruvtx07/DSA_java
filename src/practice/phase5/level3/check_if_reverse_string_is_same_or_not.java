package practice.phase5.level3;
import java.util.Scanner;

public class check_if_reverse_string_is_same_or_not {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("string reverse checked");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("enter string1: ");
        String s1 = sc.nextLine();

        System.out.print("enter string2: ");
        String s2 = sc.nextLine();

        int length1 = s1.length();
        int length2 = s2.length();

        boolean flag = false;
        if(length1 == length2 && (length1 == 1 || length1 == 0)){
            flag  = true;
        }
        if(length1 == length2){
            int p1 = 0;
            int p2 = length2-1;
            while(p1<length1 && p2>=0){
                if(s1.charAt(p1) == s2.charAt(p2)){
                    flag = true;
                }else{
                    flag = false;
                    break;
                }

                p1++;
                p2--;
            }
        }

        if(flag){
            System.out.println("both strings are reverse of each other");
        }else{
            System.out.println("false");
        }

        sc.close();
    }
}
