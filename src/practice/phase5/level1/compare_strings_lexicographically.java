package practice.phase5.level1;
import java.util.Scanner;

public class compare_strings_lexicographically {
    public static int compareStrings(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int min = Math.min(n1, n2);

        for (int i = 0; i < min; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if(s1.charAt(i) < s2.charAt(i)){
                    return 1;
                }else{
                    return 2;
                }
            }
        }

        if(s1.length() == s2.length()){
            return 0;
        }else if(s1.length() < s2.length()){
            return 1;
        }else{
            return 2;
        }
    }
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("compare strings lexicographically");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter string 2: ");
        String s2 = sc.nextLine();

        int result = compareStrings(s1, s2);

        if (result == 0) {
            System.out.println("Equal");
        } else if (result == 1) {
            System.out.println(s1 + " is smaller");
        } else{
            System.out.println(s1 + " is greater");
        }

        sc.close();
    }
}
