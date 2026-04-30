package practice.phase3.level4;
import java.util.Scanner;

public class remove_spaces_from_string_using_recursion {
    public static StringBuilder fun(int i, int n, String s1, StringBuilder s2){
     if(i == n){
       return s2;
     }
     if(s1.charAt(i) != ' '){
         s2.append(s1.charAt(i));
     }
    return fun(i+1, n, s1, s2);
    }
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("removing spaces from string");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter something with spaces: ");
        String s1 = sc.nextLine();

        StringBuilder s2 = new StringBuilder();
        StringBuilder s3 = new StringBuilder();
        s3.append(fun(0, s1.length(), s1, s2));

        System.out.println(s3);

        sc.close();

    }
}
